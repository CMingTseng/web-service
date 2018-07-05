package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.web.dto.CategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Long> ,CategoryCustomRepo{
}
