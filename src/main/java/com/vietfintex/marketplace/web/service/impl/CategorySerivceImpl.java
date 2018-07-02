package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.persistence.model.GroupClub;
import com.vietfintex.marketplace.persistence.repo.CategoryRepo;
import com.vietfintex.marketplace.persistence.repo.GroupClubRepo;
import com.vietfintex.marketplace.util.BaseMapper;
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
    protected PagingAndSortingRepository<Category, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<Category, CategoryDTO> getMapper() {
        return mapper;
    }
}
