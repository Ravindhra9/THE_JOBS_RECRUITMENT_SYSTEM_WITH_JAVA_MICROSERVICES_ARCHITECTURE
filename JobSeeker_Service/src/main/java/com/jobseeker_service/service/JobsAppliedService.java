package com.jobseeker_service.service;


import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.jobseeker_service.entity.JobsApplied;
import com.jobseeker_service.entity.JobsPosted;
import com.jobseeker_service.entity.Resume;
import com.jobseeker_service.entity.ResumesOfJobSeeker;
import com.jobseeker_service.repository.JobsAppliedRepository;
import com.jobseeker_service.repository.ResumeRepository;
import com.jobseeker_service.repository.ResumesOfJobSeekerRepository;

@Service
public class JobsAppliedService {

	@Autowired
	JobsAppliedRepository jrepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ResumesOfJobSeekerRepository resumesrepository;
	
	@Autowired
	ResumeRepository resumerepository;
	
	public String applyJob(Integer jobSeekerId,Integer resumeId, Integer jobPostedId) {
		
		
		
		JobsApplied japplied=new JobsApplied();
		
		try
		{
		japplied=jrepository.findByJobspostedId(jobPostedId);
		
		if(japplied != null) {
			throw new IllegalArgumentException("The Job is already applied");
		}
		
		}
		catch (NoSuchElementException e) {
		
		japplied.setJobSeekerId(jobSeekerId);
		japplied.setResumeId( resumeId);
		japplied.setJobspostedId(jobPostedId);
		japplied.setStatus("Applied");
		
		japplied=jrepository.save(japplied);
		
		//store the resume to employer resumes
		
		
        ResumesOfJobSeeker rjobseeker=new ResumesOfJobSeeker();
		
		Resume resume=resumerepository.findById(resumeId).get();
		
		rjobseeker.setJobseekerName(resume.getJobseekerName());
		rjobseeker.setJobseekerEmail(resume.getJobseekerEmail());
		rjobseeker.setHighestQualification(resume.getHighestQualification());
		rjobseeker.setCourse(resume.getCourse());
		rjobseeker.setSpecialization(resume.getSpecialization());
		rjobseeker.setUniversityName(resume.getUniversityName());
		rjobseeker.setPassingYear(resume.getPassingYear());
		rjobseeker.setSkills(resume.getSkills());
		rjobseeker.setSkills(resume.getSkills());
		rjobseeker.setExperiance(resume.getExperiance());
		rjobseeker.setJobId(japplied.getJobspostedId());
		rjobseeker.setJobAppliedId(japplied.getJobId());
		rjobseeker.setStatus("Not Seen");
		
		
		resumesrepository.save(rjobseeker);
		
		return "applied";
		
		}
		
		return "applied";
	}


	public String showJobsAppliedByJobSeeker(Integer jobseekerid) {
		
		List<JobsApplied> japplied=jrepository.findAll();
		
		String jobsapplied="";
		
		
		for(JobsApplied j:japplied)
		{
			if(j.getJobSeekerId()==jobseekerid) {
				
			JobsPosted jposted=restTemplate.getForObject("http://localhost:9001/jobposted/"+j.getJobspostedId(),JobsPosted.class);
			
			jobsapplied=jobsapplied+jposted+"  Status :"+j.getStatus()+" \n\n\n";
			
			}
		}
		
		
		
		return jobsapplied;
	}

}
