package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.Order;
import com.vietfintex.marketplace.persistence.model.OrderDetail;
import com.vietfintex.marketplace.persistence.repo.OrderDetailRepo;
import com.vietfintex.marketplace.persistence.repo.OrderRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.OrderDTO;
import com.vietfintex.marketplace.web.dto.OrderDetailDTO;
import com.vietfintex.marketplace.web.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl extends AbstractService<Order, OrderDTO> implements OrderService {
    private static final BaseMapper<Order, OrderDTO> mapper = new BaseMapper<>(Order.class, OrderDTO.class);
    private static final BaseMapper<OrderDetail, OrderDetailDTO> detailMapper = new BaseMapper<>(OrderDetail.class, OrderDetailDTO.class);
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private OrderDetailRepo orderDetailRepo;

    @Override
    protected PagingAndSortingRepository<Order, Long> getDao() {
        return orderRepo;
    }

    @Override
    protected BaseMapper<Order, OrderDTO> getMapper() {
        return mapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public OrderDTO save(OrderDTO orderDTO) throws Exception {
        OrderDTO rs = getMapper().toDtoBean(getDao().save(getMapper().toPersistenceBean(orderDTO)));
        List<OrderDetailDTO> optionVariantList = Optional.ofNullable(orderDTO.getOrderDetailList())
                .orElseGet(ArrayList::new);
        if (!optionVariantList.isEmpty()) {
            orderDetailRepo.saveAll(detailMapper.toPersistenceBean(orderDTO.getOrderDetailList()));
        }
        return rs;
    }

    @Override
    public List<OrderDTO> search(OrderDTO searchDTO, Pageable pageable) throws Exception {
        return orderRepo.search(searchDTO, pageable);
    }

    @Override
    public Long count(OrderDTO searchDTO) {
        return orderRepo.count(searchDTO);
    }
}
