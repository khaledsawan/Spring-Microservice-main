package com.hexagon.companyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexagon.companyservice.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {
}
