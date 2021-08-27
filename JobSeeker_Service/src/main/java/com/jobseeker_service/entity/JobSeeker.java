package com.jobseeker_service.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JobSeeker {
	
	@Id
	private Integer jobSeekerId;
	private String jobSeekerName;
	private String jobSeekerEmail;
	private String mobileNumber;
	private String password;
	private String currentCity;
	private String gender;
	private LocalDate dateOfBirth;
	
	
	
	public JobSeeker() {
		super();
	}


	public JobSeeker(Integer jobSeekerId, String jobSeekerName, String jobSeekerEmail, String mobileNumber,
			String password, String currentCity, String gender, LocalDate dateOfBirth) {
		super();
		this.jobSeekerId = jobSeekerId;
		this.jobSeekerName = jobSeekerName;
		this.jobSeekerEmail = jobSeekerEmail;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.currentCity = currentCity;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}


	public Integer getJobSeekerId() {
		return jobSeekerId;
	}


	public void setJobSeekerId(Integer jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}


	public String getJobSeekerName() {
		return jobSeekerName;
	}


	public void setJobSeekerName(String jobSeekerName) {
		this.jobSeekerName = jobSeekerName;
	}


	public String getJobSeekerEmail() {
		return jobSeekerEmail;
	}


	public void setJobSeekerEmail(String jobSeekerEmail) {
		this.jobSeekerEmail = jobSeekerEmail;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCurrentCity() {
		return currentCity;
	}


	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	@Override
	public String toString() {
		return "JobSeeker [jobSeekerId=" + jobSeekerId + ", jobSeekerName=" + jobSeekerName + ", jobSeekerEmail="
				+ jobSeekerEmail + ", mobileNumber=" + mobileNumber + ", password=" + password + ", currentCity="
				+ currentCity + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	
	
	
	
	
	

}
