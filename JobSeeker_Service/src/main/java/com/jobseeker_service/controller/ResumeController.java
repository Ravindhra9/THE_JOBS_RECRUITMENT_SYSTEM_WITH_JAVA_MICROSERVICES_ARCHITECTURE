package com.jobseeker_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobseeker_service.entity.Resume;
import com.jobseeker_service.service.ResumeService;

@RestController
public class ResumeController {
	
	@Autowired
	ResumeService rservice;
	
	@PostMapping("resume")
	Resume createResume(@RequestBody Resume r)
	{
		return rservice.createResume(r);
	}
	
	@GetMapping("resume/{rid}")
	Resume getResume(@PathVariable("rid") Integer resumeId)
	{
		return rservice.getResume(resumeId);
	}
	
	

}
