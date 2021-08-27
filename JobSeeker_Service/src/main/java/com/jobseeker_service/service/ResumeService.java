package com.jobseeker_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobseeker_service.entity.Resume;
import com.jobseeker_service.repository.ResumeRepository;

@Service
public class ResumeService {

	@Autowired
	ResumeRepository rrepository;
	
	public Resume createResume(Resume r) {
		
		return rrepository.save(r);
	}

	public Resume getResume(Integer resumeId) {
		
		return rrepository.findById(resumeId).get();
	}

}
