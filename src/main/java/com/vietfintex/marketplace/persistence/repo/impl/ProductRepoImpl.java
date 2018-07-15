package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.Product;
import com.vietfintex.marketplace.persistence.repo.ProductCustomRepo;
import com.vietfintex.marketplace.web.dto.ProductDTO;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.vietfintex.marketplace.util.GlobalUtil.isEmpty;
import static com.vietfintex.marketplace.util.NumberUtils.convertToLong;
import static java.util.Objects.isNull;

public class ProductRepoImpl implements ProductCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Product> search(ProductDTO searchDTO, Pageable pageable) {
        if (isNull(searchDTO)) {
            return null;
        }
        Map<String, Object> param = new HashMap<>();
        String sql = "SELECT * FROM product p WHERE 1=1 ";
        if (!isEmpty(searchDTO.getProductCode())) {
            sql += " AND p.product_code like CONCAT('%',:productCode,'%')";
            param.put("productCode", searchDTO.getProductCode());
        }
        if (!isEmpty(searchDTO.getProductName())) {
            sql += " AND p.product_name like CONCAT('%',:productName,'%')";
            param.put("productName", searchDTO.getProductName());
        }
        if (!isEmpty(searchDTO.getShortDescription())) {
            sql += " AND p.short_description like CONCAT('%',:shortDescription,'%')";
            param.put("fullDescription", searchDTO.getShortDescription());
        }
        if (!isEmpty(searchDTO.getFullDescription())) {
            sql += " AND p.full_description like CONCAT('%',:fullDescription,'%')";
            param.put("fullDescription", searchDTO.getFullDescription());
        }
        if (!isEmpty(searchDTO.getApproved())) {
            sql += " AND p.approved = :approved";
            param.put("approved", searchDTO.getApproved());
        }
        if (!isEmpty(searchDTO.getFreeShipping())) {
            sql += " AND p.free_shipping = :freeShipping ";
            param.put("freeShipping", searchDTO.getFreeShipping());
        }
        if (!isEmpty(searchDTO.getStatus())) {
            sql += " AND p.status = :status";
            param.put("status", searchDTO.getStatus());
        }
        if (!isNull(searchDTO.getCategoryId())) {
            sql += " AND p.category_id = :categoryId";
            param.put("categoryId", searchDTO.getCategoryId());
        }
        if (!isNull(searchDTO.getStoreId())) {
            sql += " AND p.store_id = :storeId";
            param.put("storeId", searchDTO.getStoreId());
        }
        Query query = em.createNativeQuery(sql, Product.class);
        param.forEach(query::setParameter);
        query.setFirstResult(pageable.getPageNumber());
        query.setMaxResults(pageable.getPageSize());
        return query.getResultList();
    }

    @Override
    public Long count(ProductDTO searchDTO) {
        if (isNull(searchDTO)) {
            return null;
        }
        Map<String, Object> param = new HashMap<>();
        String sql = "SELECT 1 FROM product p WHERE 1=1 ";
        if (!isEmpty(searchDTO.getProductCode())) {
            sql += " AND p.product_code like CONCAT('%',:productCode,'%')";
            param.put("productCode", searchDTO.getProductCode());
        }
        if (!isEmpty(searchDTO.getProductName())) {
            sql += " AND p.product_name like CONCAT('%',:productName,'%')";
            param.put("productName", searchDTO.getProductName());
        }
        if (!isEmpty(searchDTO.getApproved())) {
            sql += " AND p.approved like CONCAT('%',:approved,'%')";
            param.put("approved", searchDTO.getApproved());
        }
        if (!isEmpty(searchDTO.getFreeShipping())) {
            sql += " AND p.free_shipping like CONCAT('%',:freeShipping,'%')";
            param.put("freeShipping", searchDTO.getFreeShipping());
        }
        if (!isEmpty(searchDTO.getStatus())) {
            sql += " AND p.status = :status";
            param.put("status", searchDTO.getStatus());
        }
        Query query = em.createNativeQuery(sql);
        param.forEach(query::setParameter);
        return convertToLong(query.getSingleResult());
    }
}
