package com.vietfintex.marketplace.web.service;

import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

public interface IOperations<T extends Serializable, K extends Serializable> {

    // read - one

    K findOne(final Long id);

    // read - all

    List<K> findAll();

    Page<K> findPaginated(int page, int size);

    // write

    K create(final T entity);

    K update(final T entity);

    void delete(final T entity);

    void deleteById(final long entityId);

}
