package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.service.IOperations;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractService<Model extends Serializable, DTO extends Serializable> implements IOperations<Model, DTO> {
    @Override
    @Transactional(readOnly = true)
    public DTO findOne(final Long id) {
        return getDao().findById(id)
                .map(x -> getMapper().toDtoBean(x))
                .orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DTO> findAll() {
        return getMapper().toDtoBean(getDao().findAll());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public DTO create(final DTO entity) {
        return getMapper().toDtoBean(getDao().save(getMapper().toPersistenceBean(entity)));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public DTO update(final DTO entity) {
        return getMapper().toDtoBean(getDao().save(getMapper().toPersistenceBean(entity)));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(final Model entity) {
        getDao().delete(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(final long entityId) {
        getDao().deleteById(entityId);
    }

    protected abstract PagingAndSortingRepository<Model, Long> getDao();

    protected abstract BaseMapper<Model, DTO> getMapper();

}
