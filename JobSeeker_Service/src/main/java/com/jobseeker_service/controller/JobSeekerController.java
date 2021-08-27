package com.jobseeker_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobseeker_service.entity.JobSeeker;
import com.jobseeker_service.service.JobSeekerService;

@RestController
public class JobSeekerController {
	
	@Autowired
	JobSeekerService jservice;
	
	@PostMapping("jobseeker")
	JobSeeker register(@RequestBody JobSeeker j)
	{
		return jservice.register(j);
	}

}
