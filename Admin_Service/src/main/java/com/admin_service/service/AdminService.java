package com.admin_service.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.admin_service.entity.JobsPosted;
import com.admin_service.repository.JobsPostedRepository;


@Service
public class AdminService {
		
	@Autowired
	JobsPostedRepository jrepository;
	

	public List<JobsPosted> viewJobsPostedByIndustryType(String industryType) {
		
		List<JobsPosted> jposted=jrepository.findAll();
		
		List<JobsPosted> jposted_i=new ArrayList<>();
		
		for(JobsPosted j:jposted)
		{
			if(j.getIndustryType().equals(industryType))
			{
				jposted_i.add(j);
			}
		}
		
		return jposted_i;
	}

	public List<JobsPosted> deleteJobsPostedByExpiryDate() {
		
        List<JobsPosted> jposted=jrepository.findAll();
		
		List<JobsPosted> jposted_expired=new ArrayList<>();
		
		for(JobsPosted j:jposted)
		{
			if(j.getExpiryDate().isBefore(LocalDate.now()))
			{
				jposted_expired.add(j);
				jrepository.delete(j);
			}
		}
		return jposted_expired;
	}

}
