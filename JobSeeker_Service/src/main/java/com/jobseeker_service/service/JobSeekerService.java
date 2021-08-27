package com.jobseeker_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobseeker_service.entity.JobSeeker;
import com.jobseeker_service.repository.JobSeekerRepository;

@Service
public class JobSeekerService {

	@Autowired
	JobSeekerRepository jrepository;
	
	public JobSeeker register(JobSeeker j) {
		
		return jrepository.save(j);
	}

}
