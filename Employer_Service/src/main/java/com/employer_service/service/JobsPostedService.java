package com.employer_service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employer_service.entity.JobsPosted;
import com.employer_service.repository.JobsPostedRepository;

@Service
public class JobsPostedService {

	@Autowired
	JobsPostedRepository jrepository;
	
	public JobsPosted postJob(JobsPosted j) {
		
		return jrepository.save(j);
	}

	public List<JobsPosted> getJobsPostedByEmployer(Integer employerId) {
		
        List<JobsPosted> jposted=jrepository.findAll();
		
		List<JobsPosted> ejposted=new ArrayList<>();
		
		for(JobsPosted j:jposted)
		{
			if(j.getEmployerId()==employerId)
			{
				ejposted.add(j);
			}
		}
		
		return ejposted;
	}

	public JobsPosted getJobPostedDetailsById(Integer jobId) {
		
		return jrepository.findById(jobId).get();
	}

}
