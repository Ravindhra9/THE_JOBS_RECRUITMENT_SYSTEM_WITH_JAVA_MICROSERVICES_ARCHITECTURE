package com.employer_service.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employer_service.entity.JobsPosted;
import com.employer_service.repository.JobsPostedRepository;

@Service
public class JobsPostedService {

	@Autowired
	JobsPostedRepository jrepository;
	
	JobsPosted jposted;
	
	public JobsPosted postJob(JobsPosted j) {
		
         try {
			
			jposted=jrepository.findById(j.getJobId()).get();
			
			if(jposted != null) {
				throw new IllegalArgumentException("The Job is already posted");
			}
		}
		catch (NoSuchElementException e) {
			return jrepository.save(j);
		}
		
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
