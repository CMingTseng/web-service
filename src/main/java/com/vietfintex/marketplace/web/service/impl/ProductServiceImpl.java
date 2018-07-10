package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.Product;
import com.vietfintex.marketplace.persistence.repo.ProductRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.ImageLinkDTO;
import com.vietfintex.marketplace.web.dto.ProductDTO;
import com.vietfintex.marketplace.web.dto.ProductFeatureDTO;
import com.vietfintex.marketplace.web.dto.ProductOptionDTO;
import com.vietfintex.marketplace.web.service.ImageLinkService;
import com.vietfintex.marketplace.web.service.ProductFeatureService;
import com.vietfintex.marketplace.web.service.ProductOptionService;
import com.vietfintex.marketplace.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

import static com.vietfintex.marketplace.util.DataUtil.nonNullOrEmpty;

@Service
public class ProductServiceImpl extends AbstractService<Product, ProductDTO> implements ProductService {
    private static final BaseMapper<Product, ProductDTO> mapper = new BaseMapper<>(Product.class, ProductDTO.class);
    @Autowired
    private ProductRepo repo;
    @Autowired
    private ImageLinkService imageLinkService;
    @Autowired
    private ProductOptionService productOptionService;
    @Autowired
    private ProductFeatureService productFeatureService;

    @Override
    protected PagingAndSortingRepository<Product, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<Product, ProductDTO> getMapper() {
        return mapper;
    }

    @Override
    public List<ProductDTO> search(ProductDTO searchDTO, int startPage, int pageSize) {
        return getMapper().toDtoBean(repo.search(searchDTO, startPage, pageSize));
    }

    @Override
    public Long count(ProductDTO searchDTO) {
        return repo.count(searchDTO);
    }

    @Override
    @Transactional
    public ProductDTO save(ProductDTO productDTO) throws Exception {
        Objects.requireNonNull(productDTO, "not found required productDTO param");
        //todo validate here
        List<ProductFeatureDTO> productFeatureList = productDTO.getProductFeatureList();
        List<ProductOptionDTO> productOptionList = productDTO.getProductOptionList();
        List<ImageLinkDTO> imageList = productDTO.getImageList();
        productDTO = getMapper().toDtoBean(repo.save(getMapper().toPersistenceBean(productDTO)));
        if (nonNullOrEmpty(productFeatureList)) {
            productDTO.setProductFeatureList(productFeatureService.saveAll(productFeatureList));
        }
        if (nonNullOrEmpty(productOptionList)) {
            productDTO.setProductOptionList(productOptionService.saveAll(productOptionList));
        }
        if (nonNullOrEmpty(imageList)) {
            productDTO.setImageList(imageLinkService.saveAll(imageList));
        }

        return productDTO;
    }
}
