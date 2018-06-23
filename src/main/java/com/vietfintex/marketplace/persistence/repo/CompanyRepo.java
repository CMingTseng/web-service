package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Companies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Companies, Long> {

}
