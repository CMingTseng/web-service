package com.vietfintex.marketplace.persistence.service.impl;

import com.vietfintex.marketplace.persistence.repo.BlocksRepo;
import com.vietfintex.marketplace.persistence.service.BlockService;
import com.vietfintex.marketplace.persistence.service.common.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BlockServiceImpl extends AbstractService implements BlockService {
    @Autowired
    private BlocksRepo repository;
    @Override
    protected JpaRepository getDao() {
        return repository;
    }
}
