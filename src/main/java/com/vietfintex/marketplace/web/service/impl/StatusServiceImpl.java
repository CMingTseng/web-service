package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.Status;
import com.vietfintex.marketplace.persistence.repo.StatusRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl extends AbstractService<Status, Status> implements StatusService {
    @Autowired
    private StatusRepo statusRepo;

    @Override
    protected PagingAndSortingRepository<Status, Long> getDao() {
        return statusRepo;
    }

    @Override
    protected BaseMapper<Status, Status> getMapper() {
        return new BaseMapper<>(Status.class, Status.class);
    }
}
