package com.employer_service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JobsApplied {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer jobId;
	
	private Integer jobspostedId;
	
	private Integer jobSeekerId;
	 
	private Integer resumeId;
	
	private String status;

	public JobsApplied() {
		super();
	}

	

	public JobsApplied(Integer jobId, Integer jobspostedId, Integer jobSeekerId, Integer resumeId, String status) {
		super();
		this.jobId = jobId;
		this.jobspostedId = jobspostedId;
		this.jobSeekerId = jobSeekerId;
		this.resumeId = resumeId;
		this.status = status;
	}



	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Integer getJobspostedId() {
		return jobspostedId;
	}

	public void setJobspostedId(Integer jobspostedId) {
		this.jobspostedId = jobspostedId;
	}

	public Integer getJobSeekerId() {
		return jobSeekerId;
	}

	public void setJobSeekerId(Integer jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}

	public Integer getResumeId() {
		return resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "JobsApplied [jobId=" + jobId + ", jobspostedId=" + jobspostedId + ", jobSeekerId=" + jobSeekerId
				+ ", resumeId=" + resumeId + ", status=" + status + "]";
	}

	

	
	


	

}
