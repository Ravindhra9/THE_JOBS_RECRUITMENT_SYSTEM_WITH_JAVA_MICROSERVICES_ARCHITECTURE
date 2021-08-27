package com.employer_service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employer_service.entity.JobsApplied;
import com.employer_service.entity.JobsPosted;
import com.employer_service.entity.Resume;
import com.employer_service.entity.ResumesOfJobSeeker;
import com.employer_service.repository.JobsAppliedRepository;
import com.employer_service.repository.JobsPostedRepository;
import com.employer_service.repository.ResumeRepository;
import com.employer_service.repository.ResumesOfJobSeekerRepository;

@Service
public class ResumesOfJobSeekerService {
	
	@Autowired
	ResumeRepository resumerepository;

	@Autowired
	ResumesOfJobSeekerRepository rrepository;
	
	@Autowired
	JobsAppliedRepository jappliedrepository;
	
	@Autowired
	JobsPostedRepository jrepository;
	
	public List<ResumesOfJobSeeker> viewSubmittedResumesByEmployerId(Integer employerId) {
		
		List<ResumesOfJobSeeker> resumes=rrepository.findAll();
		
		List<ResumesOfJobSeeker> eresumes=new ArrayList<ResumesOfJobSeeker>();
		
		for(ResumesOfJobSeeker r:resumes)
		{
			Integer jid=r.getJobId();
			
			JobsPosted jposted=jrepository.findById(jid).get();
			
			if(jposted.getEmployerId()==employerId)
			{
				eresumes.add(r);
			}	
				
		}
		return eresumes;
	}

	public ResumesOfJobSeeker shortlistResume(Integer resumeId, String status) {
		
		//Update Status in Employer Resumes
		
		ResumesOfJobSeeker rjobseeker=rrepository.findById(resumeId).get();
		
		rjobseeker.setStatus(status);
		
		//Update Visitors Count in JobSeeker Resumes
		
		Resume resume=resumerepository.findByJobseekerEmail(rjobseeker.getJobseekerEmail());
		
		resume.setVisitorsCount(resume.getVisitorsCount()+1);
		
		resumerepository.save(resume);
		
		//Update Job Status in JobSeeker Jobs Applied
		
		JobsApplied japplied=jappliedrepository.findById(rjobseeker.getJobAppliedId()).get();
		
		japplied.setStatus(status);
		
		jappliedrepository.save(japplied);
		
		return rrepository.save(rjobseeker);
	}

}
