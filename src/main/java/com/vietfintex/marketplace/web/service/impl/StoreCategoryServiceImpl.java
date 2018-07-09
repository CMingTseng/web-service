package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.persistence.model.GroupClub;
import com.vietfintex.marketplace.persistence.model.StoreCategory;
import com.vietfintex.marketplace.persistence.repo.GroupClubRepo;
import com.vietfintex.marketplace.persistence.repo.GroupMemberRepo;
import com.vietfintex.marketplace.persistence.repo.StoreCategoryRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.CategoryDTO;
import com.vietfintex.marketplace.web.dto.GroupClubDTO;
import com.vietfintex.marketplace.web.dto.StoreCategoryDTO;
import com.vietfintex.marketplace.web.dto.StoreCategoryWrapDTO;
import com.vietfintex.marketplace.web.service.StoreCategoryService;
import com.vietfintex.marketplace.web.service.impl.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StoreCategoryServiceImpl extends AbstractService<StoreCategory, StoreCategoryDTO> implements StoreCategoryService {
    private static final BaseMapper<StoreCategory, StoreCategoryDTO> mapper = new BaseMapper<>(StoreCategory.class,
            StoreCategoryDTO.class);
    @Autowired
    private StoreCategoryRepo repo;

    @Override
    protected PagingAndSortingRepository<StoreCategory, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<StoreCategory, StoreCategoryDTO> getMapper() {
        return mapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public StoreCategoryDTO modifyStoreCategory(StoreCategoryDTO storeCategoryDTO, String action) {
        if("D".equals(action)){ //Truong hop xoa
            if(storeCategoryDTO.getStoreCategoryId() != null){
                StoreCategory item = repo.findById(storeCategoryDTO.getStoreCategoryId()).orElse(null);
                if (item != null){
                    repo.delete(item);
                    return storeCategoryDTO;
                }
            }
        }else{ //Truong hop sua hoac them moi
            return getMapper().toDtoBean(repo.save(getMapper().toPersistenceBean(storeCategoryDTO)));
        }
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void storeCategoryChange(long storeId, List<Long> categoryIdList) {
        repo.deleteAll();
        repo.storeCategoryChange(storeId,categoryIdList);
    }
}
