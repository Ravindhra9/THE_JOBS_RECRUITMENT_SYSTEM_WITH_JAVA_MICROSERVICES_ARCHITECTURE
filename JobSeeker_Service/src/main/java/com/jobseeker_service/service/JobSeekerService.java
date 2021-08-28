package com.jobseeker_service.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobseeker_service.entity.JobSeeker;
import com.jobseeker_service.repository.JobSeekerRepository;

@Service
public class JobSeekerService {

	@Autowired
	JobSeekerRepository jrepository;

	JobSeeker jseeker;

	public JobSeeker register(JobSeeker j) {

		try {

			jseeker = jrepository.findById(j.getJobSeekerId()).get();

			if (jseeker != null) {
				throw new IllegalArgumentException("The JobSeeker already registered");
			}

		} catch (NoSuchElementException e) {
			return jrepository.save(j);
		}

		return jrepository.save(j);

	}

}
