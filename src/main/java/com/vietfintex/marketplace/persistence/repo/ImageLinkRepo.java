package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.ImagesLink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageLinkRepo extends JpaRepository<ImagesLink, Long>, ImageLinkCustomRepo {
}
