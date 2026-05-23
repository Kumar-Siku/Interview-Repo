package com.innoventes.test.app.repository;

import com.innoventes.test.app.dto.CompanyDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import com.innoventes.test.app.entity.Company;

import java.util.Optional;


public interface CompanyRepository extends JpaRepository<Company, Long> {
	public Optional<Company> findById(Long id);
    public Optional<Company> findByCompanyCode(String id);
}