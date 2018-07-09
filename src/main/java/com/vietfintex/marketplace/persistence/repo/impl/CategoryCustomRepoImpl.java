package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.persistence.repo.CategoryCustomRepo;
import com.vietfintex.marketplace.util.GlobalUtil;
import com.vietfintex.marketplace.util.NumberUtils;
import com.vietfintex.marketplace.web.dto.CategoryDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Objects.isNull;

public class CategoryCustomRepoImpl implements CategoryCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<CategoryDTO> getAllCategory() {
        String sql = "SELECT ca.category_id categoryId, COALESCE (ca.category_description,'') categoryDescription, "
                +" COALESCE (ca.category_name,'') categoryName, COALESCE(sc.status,'') as status,COALESCE (ca.is_trash ,'') as isTrash, "
                + " img.image_id imageId, img.image_path imageUrl FROM category ca INNER JOIN image img ON ca.imgId = img.image_id ";
        Query query = em.createNativeQuery(sql);

        return null;
    }

    @Override
    public List<Category> searchCategory(String searchKey, int page) {
        String sql = "SELECT ca.* FROM category ca WHERE 1 =1 ";
        Map<String, Object> param = new HashMap<>();
        if(searchKey != null && !"".equals(searchKey)){
            sql +=" AND ca.category_name like N'%"+searchKey+"%'";

        }
        Query query = em.createNativeQuery(sql, Category.class);
        query.setMaxResults(10);
        query.setFirstResult(page);
        return query.getResultList();
    }
    @Override
    public List<CategoryDTO> getListStoreCategory(Long storeCategoryId, Long storeId, Long categoryId,
                                               String keySearch, int page) {
        boolean getStoreCategory = false;
        Map<String, Object> param = new HashMap<>();
        String sql ="SELECT ca.category_id categoryId, COALESCE (ca.category_description,'') categoryDescription," +
                "COALESCE (ca.category_name,'') categoryName, COALESCE(sc.status,'') as status,COALESCE (ca.is_trash ,'') as isTrash, sc.store_id storeId," +
                "sc.store_category_id storeCategoryId , ca.parent_category_id parentCategoryId, img.image_id imageId, img.image_path imageUrl FROM category ca INNER JOIN store_category sc ON ca.category_id = sc.category_id" +
                " INNER JOIN image img ON ca.imgId = img.image_id WHERE  1 = 1 ";
        if(storeCategoryId!=null){
            sql += " AND sc.store_category_id = :storeCategoryId";
            param.put("storeCategoryId",storeCategoryId);
            getStoreCategory = true;
        }
        if(storeId!=null){
            sql += " AND sc.store_id = :storeId";
            param.put("storeId",storeId);
            getStoreCategory = true;
        }
        if (!getStoreCategory){
            sql = "SELECT ca.category_id categoryId, COALESCE (ca.category_description,'') categoryDescription, "
                    +" COALESCE (ca.category_name,'') categoryName, COALESCE(ca.status,'') as status,COALESCE (ca.is_trash ,'') as isTrash, "
                    + " ca.parent_category_id parentCategoryId, img.image_id imageId, img.image_path imageUrl FROM category ca INNER JOIN image img ON ca.imgId = img.image_id "
                    +" WHERE 1=1 ";

        }
        if(categoryId!=null){
            sql +=  " AND ca.category_id = :categoryId";
            param.put("categoryId",categoryId);
        }
        if(keySearch != null && !"".equals(keySearch)){
            sql +=" AND ca.category_name like N'%"+keySearch+"%'";
        }
        Query query = em.createNativeQuery(sql);
        if(getStoreCategory){
            query.setMaxResults(10);
            query.setFirstResult(page);
        }
        param.forEach(query::setParameter);
        List<Object[]> lst = query.getResultList();
        List<CategoryDTO> returnList = new ArrayList<>();
        if(isNull(lst)){
            return null;
        }
        int i;
        for (Object[] obj: lst) {
            i = 0;
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setCategoryId(NumberUtils.convertToLong(obj[i++]));
            categoryDTO.setCategoryDescription(GlobalUtil.convertToString(obj[i++]));
            categoryDTO.setCategoryName(GlobalUtil.convertToString(obj[i++]));
            categoryDTO.setStatus(GlobalUtil.convertToString(obj[i++]));
            categoryDTO.setIsTrash(GlobalUtil.convertToString(obj[i++]));
            if (getStoreCategory){
                categoryDTO.setStoreId(NumberUtils.convertToLong(obj[i++]));
                categoryDTO.setStoreCategoryId(NumberUtils.convertToLong(obj[i++]));
            }
            categoryDTO.setParentCategoryId(NumberUtils.convertToLong(obj[i++]));
            categoryDTO.setImageId(NumberUtils.convertToLong(obj[i++]));
            categoryDTO.setImageUrl(NumberUtils.convertToString(obj[i++]));
            returnList.add(categoryDTO);
        }
        return returnList;
    }
}
