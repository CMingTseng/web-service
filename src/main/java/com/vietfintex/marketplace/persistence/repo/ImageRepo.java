package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepo extends JpaRepository<Image, Long>, ImageCustomRepo {
}
