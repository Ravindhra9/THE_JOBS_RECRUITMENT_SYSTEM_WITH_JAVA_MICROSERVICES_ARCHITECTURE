package com.jobseeker_service.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resume {
	
	@Id
	private Integer resumeId;
	private String jobseekerName;
	private String jobseekerEmail;
	private String highestQualification;
	private String course;
	private String specialization;
	private String universityName;
	private String passingYear;
	private String skills;
	private String experiance;
	private Integer jobSeekerId;
	private Integer visitorsCount;
	
	public Resume() {
		super();
	}

	public Resume(Integer resumeId, String jobseekerName, String jobseekerEmail, String highestQualification,
			String course, String specialization, String universityName, String passingYear, String skills,
			String experiance, Integer jobSeekerId, Integer visitorsCount) {
		super();
		this.resumeId = resumeId;
		this.jobseekerName = jobseekerName;
		this.jobseekerEmail = jobseekerEmail;
		this.highestQualification = highestQualification;
		this.course = course;
		this.specialization = specialization;
		this.universityName = universityName;
		this.passingYear = passingYear;
		this.skills = skills;
		this.experiance = experiance;
		this.jobSeekerId = jobSeekerId;
		this.visitorsCount = visitorsCount;
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
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
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

	public Integer getJobSeekerId() {
		return jobSeekerId;
	}

	public void setJobSeekerId(Integer jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}

	public Integer getVisitorsCount() {
		return visitorsCount;
	}

	public void setVisitorsCount(Integer visitorsCount) {
		this.visitorsCount = visitorsCount;
	}

	@Override
	public String toString() {
		return "Resume [resumeId=" + resumeId + ", jobseekerName=" + jobseekerName + ", jobseekerEmail="
				+ jobseekerEmail + ", highestQualification=" + highestQualification + ", course=" + course
				+ ", specialization=" + specialization + ", UniversityName=" + universityName + ", passingYear="
				+ passingYear + ", skills=" + skills + ", experience=" + experiance + ", jobSeekerId=" + jobSeekerId
				+ ", visitorsCount=" + visitorsCount + "]";
	}
	

}
