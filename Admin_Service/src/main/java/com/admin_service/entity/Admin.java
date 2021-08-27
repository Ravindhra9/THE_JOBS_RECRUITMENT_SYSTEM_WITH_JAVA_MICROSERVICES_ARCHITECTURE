package com.admin_service.entity;

public class Admin {
	
	private Integer adminId;
	private String adminName;
	private String email;
	private String mobileNumber;
	
	public Admin() {
		super();
	}

	public Admin(Integer adminId, String adminName, String email, String mobileNumber) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", email=" + email + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
	
	

}
