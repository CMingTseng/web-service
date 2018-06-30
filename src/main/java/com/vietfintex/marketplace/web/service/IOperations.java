package com.vietfintex.marketplace.web.service;

import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

public interface IOperations<Model extends Serializable, DTO extends Serializable> {

    // read - one

    DTO findOne(final Long id);

    // read - all

    List<DTO> findAll();

    // write

    DTO create(final Model entity);

    DTO update(final Model entity);

    void delete(final Model entity);

    void deleteById(final long entityId);

}
