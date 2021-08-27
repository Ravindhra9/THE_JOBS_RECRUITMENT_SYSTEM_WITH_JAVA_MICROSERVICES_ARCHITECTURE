package com.jobseeker_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobseeker_service.entity.JobsApplied;

@Repository
public interface JobsAppliedRepository extends JpaRepository<JobsApplied, Integer>{


}
