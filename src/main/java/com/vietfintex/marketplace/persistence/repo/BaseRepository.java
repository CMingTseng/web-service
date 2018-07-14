package com.vietfintex.marketplace.persistence.repo;

import com.querydsl.core.types.dsl.EntityPathBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<Model, QModel extends EntityPathBase<Model>, ID extends Serializable> extends JpaRepository<Model, ID>, QuerydslPredicateExecutor<Model>, QuerydslBinderCustomizer<QModel> {
}
