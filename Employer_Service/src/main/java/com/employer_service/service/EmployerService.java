package com.employer_service.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employer_service.entity.Employer;
import com.employer_service.repository.EmployerRepository;

@Service
public class EmployerService {
	
	@Autowired
	EmployerRepository erepository;

    Employer employer;
	
	public Employer register(Employer emp) {
		
		try {
			
			employer=erepository.findById(emp.getEmployerId()).get();
			
			if(employer != null) {
				throw new IllegalArgumentException("The Employer already registered");
			}
		}
		catch (NoSuchElementException e) {
			return erepository.save(emp);
		}
		
		return erepository.save(emp);
		

  }
	
}
