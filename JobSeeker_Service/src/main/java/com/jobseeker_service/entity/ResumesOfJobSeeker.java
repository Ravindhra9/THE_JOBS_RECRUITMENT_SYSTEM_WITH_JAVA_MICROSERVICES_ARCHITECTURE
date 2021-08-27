package com.jobseeker_service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResumesOfJobSeeker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer resumeId;
	private String jobseekerName;
	private String jobseekerEmail;
	private String highestQualification;
	private String course;
	private String specialization;
	private String UniversityName;
	private String passingYear;
	private String skills;
	private String experiance;
	private Integer jobId;
	private String status;
	private Integer jobAppliedId;
	
	public ResumesOfJobSeeker() {
		super();
		
	}

	public ResumesOfJobSeeker(Integer resumeId, String jobseekerName, String jobseekerEmail,
			String highestQualification, String course, String specialization, String universityName,
			String passingYear, String skills, String experiance, Integer jobId, String status, Integer jobAppliedId) {
		super();
		this.resumeId = resumeId;
		this.jobseekerName = jobseekerName;
		this.jobseekerEmail = jobseekerEmail;
		this.highestQualification = highestQualification;
		this.course = course;
		this.specialization = specialization;
		UniversityName = universityName;
		this.passingYear = passingYear;
		this.skills = skills;
		this.experiance = experiance;
		this.jobId = jobId;
		this.status = status;
		this.jobAppliedId = jobAppliedId;
	}

	public Integer getResumeId() {
		return resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	public String getJobseekerName() {
		return jobseekerName;
	}

	public void setJobseekerName(String jobseekerName) {
		this.jobseekerName = jobseekerName;
	}

	public String getJobseekerEmail() {
		return jobseekerEmail;
	}

	public void setJobseekerEmail(String jobseekerEmail) {
		this.jobseekerEmail = jobseekerEmail;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getUniversityName() {
		return UniversityName;
	}

	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}

	public String getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getExperiance() {
		return experiance;
	}

	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getJobAppliedId() {
		return jobAppliedId;
	}

	public void setJobAppliedId(Integer jobAppliedId) {
		this.jobAppliedId = jobAppliedId;
	}

	@Override
	public String toString() {
		return "ResumesOfJobSeeker [resumeId=" + resumeId + ", jobseekerName=" + jobseekerName + ", jobseekerEmail="
				+ jobseekerEmail + ", highestQualification=" + highestQualification + ", course=" + course
				+ ", specialization=" + specialization + ", UniversityName=" + UniversityName + ", passingYear="
				+ passingYear + ", skills=" + skills + ", experiance=" + experiance + ", jobId=" + jobId + ", status="
				+ status + ", jobAppliedId=" + jobAppliedId + "]";
	}
	
	
	
}
	
