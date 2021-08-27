package com.employer_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employer_service.entity.ResumesOfJobSeeker;
import com.employer_service.service.ResumesOfJobSeekerService;

@RestController
public class ResumesOfJobSeekerController {
	
	@Autowired
	ResumesOfJobSeekerService rservice;
	
	@GetMapping("showresumes/{eid}")
	List<ResumesOfJobSeeker> viewSubmittedResumesByEmployerId(@PathVariable("eid") Integer employerId)
	{
		return rservice.viewSubmittedResumesByEmployerId(employerId);
	}
	
	@PutMapping("shortlistresume/{resumeid}/{status}")
	ResumesOfJobSeeker shortlistResume(@PathVariable("resumeid")Integer resumeId,@PathVariable("status")String status)
	{
		return rservice.shortlistResume(resumeId,status);
		
	}

}
