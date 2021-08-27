package com.employer_service.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JobsPosted {
	
	@Id
	private Integer jobId;
	private String jobTitle;
	private String companyName;
	private String salary;
	private String skills;
	private String experienceNeeded;
	private String location;
	private LocalDate postedDate;
	private LocalDate expiryDate;
	private Integer employerId;
	private String IndustryType;
	
	public JobsPosted() {
		super();
	}


	public JobsPosted(Integer jobId, String jobTitle, String companyName, String salary, String skills,
			String experienceNeeded, String location, LocalDate postedDate, LocalDate expiryDate, Integer employerId,
			String industryType) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.salary = salary;
		this.skills = skills;
		this.experienceNeeded = experienceNeeded;
		this.location = location;
		this.postedDate = postedDate;
		this.expiryDate = expiryDate;
		this.employerId = employerId;
		IndustryType = industryType;
	}




	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getExperienceNeeded() {
		return experienceNeeded;
	}

	public void setExperienceNeeded(String experienceNeeded) {
		this.experienceNeeded = experienceNeeded;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(LocalDate postedDate) {
		this.postedDate = postedDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getEmployerId() {
		return employerId;
	}

	public void setEmployerId(Integer employerId) {
		this.employerId = employerId;
	}




	public String getIndustryType() {
		return IndustryType;
	}


	public void setIndustryType(String industryType) {
		IndustryType = industryType;
	}




	@Override
	public String toString() {
		return "JobsPosted [jobId=" + jobId + ", jobTitle=" + jobTitle + ", companyName=" + companyName + ", salary="
				+ salary + ", skills=" + skills + ", experienceNeeded=" + experienceNeeded + ", location=" + location
				+ ", postedDate=" + postedDate + ", expiryDate=" + expiryDate + ", employerId=" + employerId
				+ ", IndustryType=" + IndustryType + "]";
	}

	
	
	

}
