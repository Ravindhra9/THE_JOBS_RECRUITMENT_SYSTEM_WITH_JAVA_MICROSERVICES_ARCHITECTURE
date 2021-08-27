package com.employer_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employer_service.entity.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Integer>{

}
