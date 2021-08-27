package com.employer_service.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employer {
	
	@Id
	private Integer employerId;
	private String employerName;
	private String companyName;
	private String industries;
	private String email;
	private String createPassword;
	private String mobileNumber;
	private LocalDate loginPeriod;
	
	
	public Employer() {
		super();
	}


	public Employer(Integer employerId, String employerName, String companyName, String industries, String email,
			String createPassword, String mobileNumber, LocalDate loginPeriod) {
		super();
		this.employerId = employerId;
		this.employerName = employerName;
		this.companyName = companyName;
		this.industries = industries;
		this.email = email;
		this.createPassword = createPassword;
		this.mobileNumber = mobileNumber;
		this.loginPeriod = loginPeriod;
	}


	public Integer getEmployerId() {
		return employerId;
	}


	public void setEmployerId(Integer employerId) {
		this.employerId = employerId;
	}


	public String getEmployerName() {
		return employerName;
	}


	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getIndustries() {
		return industries;
	}


	public void setIndustries(String industries) {
		this.industries = industries;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCreatePassword() {
		return createPassword;
	}


	public void setCreatePassword(String createPassword) {
		this.createPassword = createPassword;
	}

    
	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public LocalDate getLoginPeriod() {
		return loginPeriod;
	}


	public void setLoginPeriod(LocalDate loginPeriod) {
		this.loginPeriod = loginPeriod;
	}


	@Override
	public String toString() {
		return "Employer [employerId=" + employerId + ", employerName=" + employerName + ", companyName=" + companyName
				+ ", industries=" + industries + ", email=" + email + ", createPassword=" + createPassword
				+ ", mobileNumber=" + mobileNumber + ", loginPeriod=" + loginPeriod + "]";
	}
	
	
	
	
	
	
	
	

}
