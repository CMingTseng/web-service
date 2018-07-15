package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.ProductFeature;
import com.vietfintex.marketplace.persistence.repo.ProductFeatureCustomRepo;
import com.vietfintex.marketplace.web.dto.ProductFeatureDTO;
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
import static java.util.Objects.nonNull;

public class ProductFeatureRepoImpl implements ProductFeatureCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ProductFeature> search(ProductFeatureDTO searchDTO, Pageable pageable) {
        if (isNull(searchDTO)) {
            return null;
        }
        Map<String, Object> param = new HashMap<>();
        String sql = "SELECT * FROM product_feature p WHERE 1=1 ";
        if (!isEmpty(searchDTO.getFeatureCode())) {
            sql += " AND p.feature_code like CONCAT('%',:featureCode,'%')";
            param.put("featureCode", searchDTO.getFeatureCode());
        }
        if (!isEmpty(searchDTO.getDescription())) {
            sql += " AND p.product_name like CONCAT('%',:description,'%')";
            param.put("description", searchDTO.getDescription());
        }
        if (nonNull(searchDTO.getParentId())) {
            sql += " AND p.parent_id = :parentId ";
            param.put("parentId", searchDTO.getParentId());
        }
        if (!isEmpty(searchDTO.getStatus())) {
            sql += " AND p.status = :status";
            param.put("status", searchDTO.getStatus());
        }
        Query query = em.createNativeQuery(sql, ProductFeature.class);
        param.forEach(query::setParameter);
        query.setFirstResult(pageable.getPageNumber());
        query.setMaxResults(pageable.getPageSize());
        return query.getResultList();
    }

    @Override
    public Long count(ProductFeatureDTO searchDTO) {
        if (isNull(searchDTO)) {
            return null;
        }
        Map<String, Object> param = new HashMap<>();
        String sql = "SELECT * FROM product_feature p WHERE 1=1 ";
        if (!isEmpty(searchDTO.getFeatureCode())) {
            sql += " AND p.feature_code like CONCAT('%',:featureCode,'%')";
            param.put("featureCode", searchDTO.getFeatureCode());
        }
        if (!isEmpty(searchDTO.getDescription())) {
            sql += " AND p.product_name like CONCAT('%',:description,'%')";
            param.put("description", searchDTO.getDescription());
        }
        if (nonNull(searchDTO.getParentId())) {
            sql += " AND p.parent_id = :parentId ";
            param.put("parentId", searchDTO.getParentId());
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
