package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.Shipping;
import com.vietfintex.marketplace.persistence.repo.ShippingRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.ShippingDTO;
import com.vietfintex.marketplace.web.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ShippingServiceImpl extends AbstractService<Shipping, ShippingDTO> implements ShippingService {
    private static final BaseMapper<Shipping, ShippingDTO> mapper = new BaseMapper<>(Shipping.class, ShippingDTO.class);
    @Autowired
    private ShippingRepo shippingRepo;

    @Override
    protected PagingAndSortingRepository<Shipping, Long> getDao() {
        return shippingRepo;
    }

    @Override
    protected BaseMapper<Shipping, ShippingDTO> getMapper() {
        return mapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ShippingDTO save(ShippingDTO shippingDTO) throws Exception {
        return getMapper().toDtoBean(getDao().save(getMapper().toPersistenceBean(shippingDTO)));
    }

    @Override
    public List<ShippingDTO> search(ShippingDTO searchDTO, int startPage, int pageSize) throws Exception {
        return shippingRepo.search(searchDTO, startPage, pageSize);
    }

    @Override
    public Long count(ShippingDTO searchDTO) {
        return shippingRepo.count(searchDTO);
    }
}
