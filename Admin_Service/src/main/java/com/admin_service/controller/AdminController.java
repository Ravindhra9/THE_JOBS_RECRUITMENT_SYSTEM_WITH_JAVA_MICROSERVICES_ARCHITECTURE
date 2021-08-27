package com.admin_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.admin_service.entity.JobsPosted;
import com.admin_service.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService aservice;
	
	
	@GetMapping("viewjobsposted/{industrytype}")
	List<JobsPosted> viewJobsPostedByIndustryType(@PathVariable("industrytype")String industryType)
	{
		return aservice.viewJobsPostedByIndustryType(industryType);
		
	}
	
	@DeleteMapping("deletejobsbyexpirydate")
	List<JobsPosted> deleteJobsPostedByExpiryDate()
	{
		return aservice.deleteJobsPostedByExpiryDate();
	}

}
