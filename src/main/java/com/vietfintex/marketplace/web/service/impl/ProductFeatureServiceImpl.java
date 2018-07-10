package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.ProductFeature;
import com.vietfintex.marketplace.persistence.model.ProductFeatureVariant;
import com.vietfintex.marketplace.persistence.repo.ProductFeatureRepo;
import com.vietfintex.marketplace.persistence.repo.ProductFeatureVariantRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.ImageDTO;
import com.vietfintex.marketplace.web.dto.ImagesLinkDTO;
import com.vietfintex.marketplace.web.dto.ProductFeatureDTO;
import com.vietfintex.marketplace.web.dto.ProductFeatureVariantDTO;
import com.vietfintex.marketplace.web.service.ImageLinkService;
import com.vietfintex.marketplace.web.service.ImageService;
import com.vietfintex.marketplace.web.service.ProductFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.util.StringUtils.isEmpty;

@Service
public class ProductFeatureServiceImpl extends AbstractService<ProductFeature, ProductFeatureDTO> implements ProductFeatureService {
    private static final BaseMapper<ProductFeature, ProductFeatureDTO> mapper = new BaseMapper<>(ProductFeature.class, ProductFeatureDTO.class);
    private static final BaseMapper<ProductFeatureVariant, ProductFeatureVariantDTO> variantMapper = new BaseMapper<>(ProductFeatureVariant.class, ProductFeatureVariantDTO.class);
    @Autowired
    private ProductFeatureRepo featureRepo;
    @Autowired
    private ProductFeatureVariantRepo variantRepo;
    @Autowired
    private ImageService imageService;
    @Autowired
    private ImageLinkService imageLinkService;

    @Override
    protected PagingAndSortingRepository<ProductFeature, Long> getDao() {
        return featureRepo;
    }

    @Override
    protected BaseMapper<ProductFeature, ProductFeatureDTO> getMapper() {
        return mapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ProductFeatureDTO save(ProductFeatureDTO productFeatureDTO) throws Exception {
        ProductFeatureDTO rs = getMapper().toDtoBean(getDao().save(getMapper().toPersistenceBean(productFeatureDTO)));
        List<ProductFeatureVariantDTO> featureVariantList = Optional.ofNullable(productFeatureDTO.getFeatureVariants()).orElseGet(ArrayList::new);
        if (!featureVariantList.isEmpty()) {
            for (ProductFeatureVariantDTO variantDTO : productFeatureDTO.getFeatureVariants()) {
                variantRepo.save(variantMapper.toPersistenceBean(variantDTO));
                if (!isEmpty(variantDTO.getIconData())) {
                    ImageDTO imageDTO = new ImageDTO();
                    imageDTO.setData(variantDTO.getIconData());
                    imageDTO.setFilename(variantDTO.getIconName());
                    imageDTO = imageService.save(imageDTO);

                    ImagesLinkDTO imagesLinkDTO = new ImagesLinkDTO();
                    imagesLinkDTO.setObjectId(rs.getFeatureId());
                    imagesLinkDTO.setImageId(imageDTO.getImageId());
                    imagesLinkDTO.setObjectType("feature_variant");
                    imageLinkService.save(imagesLinkDTO);
                }

            }
        }
        return rs;
    }

    @Override
    public List<ProductFeatureDTO> search(ProductFeatureDTO searchDTO, int startPage, int pageSize) throws Exception {
        return getMapper().toDtoBean(featureRepo.search(searchDTO, startPage, pageSize));
    }

    @Override
    public Long count(ProductFeatureDTO searchDTO) {
        return featureRepo.count(searchDTO);
    }
}
