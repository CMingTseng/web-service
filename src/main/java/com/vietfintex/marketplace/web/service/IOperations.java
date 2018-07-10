package com.vietfintex.marketplace.web.service;

import java.io.Serializable;
import java.util.List;

public interface IOperations<Model extends Serializable, DTO extends Serializable> {

    // read - one

    DTO findOne(final Long id);

    // read - all

    List<DTO> findAll();

    // write

    DTO save(final DTO entity) throws Exception;

    DTO update(final DTO entity);

    void delete(final Model entity);

    void deleteById(final long entityId);

    default List<DTO> search(DTO searchDTO, int startPage, int pageSize) throws Exception {
        return null;
    }

    default Long count(DTO searchDTO) {
        return 0L;
    }
}
