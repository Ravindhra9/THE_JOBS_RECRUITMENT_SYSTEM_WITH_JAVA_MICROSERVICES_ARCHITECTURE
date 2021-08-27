package com.jobseeker_service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jobseeker_service.service.JobsAppliedService;

@RestController
public class JobsAppliedController {
	
	@Autowired
	JobsAppliedService jservice;
	
	@PostMapping("applyjob/{jobSeekerId}/{resumeId}/{jobPostedId}")
	String applyJob(@PathVariable("jobSeekerId") Integer jobSeekerId,@PathVariable("resumeId") Integer resumeId,@PathVariable("jobPostedId") Integer jobPostedId)
	{
		
		return jservice.applyJob(jobSeekerId,resumeId,jobPostedId);
		
	}
	
	@GetMapping("jobsapplied/{jobseekerid}")
	String showJobsAppliedByJobSeeker(@PathVariable("jobseekerid")Integer jobseekerid)
	{
		return jservice.showJobsAppliedByJobSeeker(jobseekerid);
	}

}
