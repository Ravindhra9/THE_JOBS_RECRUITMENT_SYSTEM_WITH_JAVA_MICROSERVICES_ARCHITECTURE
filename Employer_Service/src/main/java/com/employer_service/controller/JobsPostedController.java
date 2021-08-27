package com.employer_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employer_service.entity.JobsPosted;
import com.employer_service.service.JobsPostedService;

@RestController
public class JobsPostedController {
	
	@Autowired
	JobsPostedService jservice;
	
	@PostMapping("postjob")
	JobsPosted postJob(@RequestBody JobsPosted j)
	{
		return jservice.postJob(j);
		
	}
	
	@GetMapping("jobsposted/{employerid}")
	List<JobsPosted> getJobsPostedByEmployer(@PathVariable("employerid") Integer employerId)
	{
		return jservice.getJobsPostedByEmployer(employerId);
		
	}
	
	@GetMapping("jobposted/{jobid}")
	JobsPosted getJobPostedDetailsById(@PathVariable("jobid") Integer jobId)
	{
		return jservice.getJobPostedDetailsById(jobId);
		
	}

}
