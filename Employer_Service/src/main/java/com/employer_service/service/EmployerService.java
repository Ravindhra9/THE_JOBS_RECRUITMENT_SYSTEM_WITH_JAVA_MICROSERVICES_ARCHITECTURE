package com.employer_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employer_service.entity.Employer;
import com.employer_service.repository.EmployerRepository;

@Service
public class EmployerService {
	
	@Autowired
	EmployerRepository erepository;

	public Employer register(Employer e) {
		
		return erepository.save(e);
	}

}
