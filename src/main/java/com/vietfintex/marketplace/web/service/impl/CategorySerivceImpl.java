package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.persistence.model.GroupClub;
import com.vietfintex.marketplace.persistence.repo.CategoryRepo;
import com.vietfintex.marketplace.persistence.repo.GroupClubRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.util.GlobalUtil;
import com.vietfintex.marketplace.web.dto.CategoryDTO;
import com.vietfintex.marketplace.web.dto.GroupClubDTO;
import com.vietfintex.marketplace.web.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorySerivceImpl extends AbstractService<Category,CategoryDTO> implements CategoryService {
    private static final BaseMapper<Category, CategoryDTO> mapper = new BaseMapper<>(Category.class,
            CategoryDTO.class);
    @Autowired
    private CategoryRepo repo;

    @Override
    public List<CategoryDTO> getCategoryList() {
        return getMapper().toDtoBean(repo.findAll());
    }

    @Override
    public List<CategoryDTO> searchCategory(String searchKey, int page) {
        return getMapper().toDtoBean(repo.searchCategory((searchKey!=null && !"".equals(searchKey))?
                GlobalUtil.base64Decode(searchKey):"",page));
    }

    @Override
    public List<CategoryDTO> getListStoreCategory(Long storeCategoryId, Long storeId, Long categoryId, String keySearch, int page) {
        return repo.getListStoreCategory(storeCategoryId,storeId,categoryId,keySearch,page);
    }

    @Override
    protected PagingAndSortingRepository<Category, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<Category, CategoryDTO> getMapper() {
        return mapper;
    }
}
