package com.employer_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employer_service.entity.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Integer>{

	public Resume findByJobseekerEmail(String jobSeekerEmail);

}
