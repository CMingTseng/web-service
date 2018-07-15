package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.ProductOption;
import com.vietfintex.marketplace.persistence.model.ProductOptionVariant;
import com.vietfintex.marketplace.persistence.repo.ProductOptionRepo;
import com.vietfintex.marketplace.persistence.repo.ProductOptionVariantRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.ProductOptionDTO;
import com.vietfintex.marketplace.web.dto.ProductOptionVariantDTO;
import com.vietfintex.marketplace.web.service.ImageLinkService;
import com.vietfintex.marketplace.web.service.ImageService;
import com.vietfintex.marketplace.web.service.ProductOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductOptionServiceImpl extends AbstractService<ProductOption, ProductOptionDTO> implements ProductOptionService {
    private static final BaseMapper<ProductOption, ProductOptionDTO> mapper = new BaseMapper<>(ProductOption.class, ProductOptionDTO.class);
    private static final BaseMapper<ProductOptionVariant, ProductOptionVariantDTO> variantMapper = new BaseMapper<>(ProductOptionVariant.class, ProductOptionVariantDTO.class);
    @Autowired
    private ProductOptionRepo optionRepo;
    @Autowired
    private ProductOptionVariantRepo variantRepo;
    @Autowired
    private ImageService imageService;
    @Autowired
    private ImageLinkService imageLinkService;

    @Override
    protected PagingAndSortingRepository<ProductOption, Long> getDao() {
        return optionRepo;
    }

    @Override
    protected BaseMapper<ProductOption, ProductOptionDTO> getMapper() {
        return mapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ProductOptionDTO save(ProductOptionDTO productOptionDTO) throws Exception {
        ProductOptionDTO rs = getMapper().toDtoBean(getDao().save(getMapper().toPersistenceBean(productOptionDTO)));
        List<ProductOptionVariantDTO> optionVariantList = Optional.ofNullable(productOptionDTO.getOptionVariantList())
                .orElseGet(ArrayList::new);
        if (!optionVariantList.isEmpty()) {
            variantRepo.saveAll(variantMapper.toPersistenceBean(productOptionDTO.getOptionVariantList()));
        }
        return rs;
    }

    @Override
    public List<ProductOptionDTO> search(ProductOptionDTO searchDTO, Pageable pageable) throws Exception {
        return optionRepo.search(searchDTO, pageable);
    }

    @Override
    public Long count(ProductOptionDTO searchDTO) {
        return optionRepo.count(searchDTO);
    }
}
