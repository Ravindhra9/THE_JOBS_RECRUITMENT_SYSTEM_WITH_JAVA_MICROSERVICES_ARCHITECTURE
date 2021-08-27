package com.employer_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employer_service.entity.Employer;
import com.employer_service.service.EmployerService;

@RestController
public class EmployerController {
	
	@Autowired
	EmployerService eservice;
	
	@PostMapping("employer")
	public Employer register(@RequestBody Employer e)
	{
		return eservice.register(e);
		
	}

}
