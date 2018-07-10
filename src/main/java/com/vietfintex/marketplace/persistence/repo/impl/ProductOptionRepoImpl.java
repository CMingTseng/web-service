package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.ProductOption;
import com.vietfintex.marketplace.persistence.repo.ProductOptionCustomRepo;
import com.vietfintex.marketplace.web.dto.ProductOptionDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.vietfintex.marketplace.util.GlobalUtil.isEmpty;
import static com.vietfintex.marketplace.util.NumberUtils.convertToLong;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class ProductOptionRepoImpl implements ProductOptionCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ProductOptionDTO> search(ProductOptionDTO searchDTO, int startPage, int pageSize) {
        if (isNull(searchDTO)) {
            return null;
        }
        Map<String, Object> param = new HashMap<>();
        String sql = "SELECT * FROM product_option p WHERE 1=1 ";
        if (!isEmpty(searchDTO.getOptionName())) {
            sql += " AND p.option_name like CONCAT('%',:optionName,'%')";
            param.put("optionName", searchDTO.getOptionName());
        }
        if (!isEmpty(searchDTO.getDescription())) {
            sql += " AND p.description like CONCAT('%',:description,'%')";
            param.put("description", searchDTO.getDescription());
        }
        if (nonNull(searchDTO.getStoreId())) {
            sql += " AND p.store_id = :storeId ";
            param.put("storeId", searchDTO.getStoreId());
        }
        if (!isEmpty(searchDTO.getStatus())) {
            sql += " AND p.status = :status";
            param.put("status", searchDTO.getStatus());
        }
        Query query = em.createNativeQuery(sql, ProductOption.class);
        param.forEach(query::setParameter);
        query.setFirstResult(startPage);
        query.setMaxResults(pageSize);
        return query.getResultList();
    }

    @Override
    public Long count(ProductOptionDTO searchDTO) {
        if (isNull(searchDTO)) {
            return null;
        }
        Map<String, Object> param = new HashMap<>();
        String sql = "SELECT * FROM product_option p WHERE 1=1 ";
        if (!isEmpty(searchDTO.getOptionName())) {
            sql += " AND p.option_name like CONCAT('%',:optionName,'%')";
            param.put("optionName", searchDTO.getOptionName());
        }
        if (!isEmpty(searchDTO.getDescription())) {
            sql += " AND p.description like CONCAT('%',:description,'%')";
            param.put("description", searchDTO.getDescription());
        }
        if (nonNull(searchDTO.getStoreId())) {
            sql += " AND p.store_id = :storeId ";
            param.put("storeId", searchDTO.getStoreId());
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
