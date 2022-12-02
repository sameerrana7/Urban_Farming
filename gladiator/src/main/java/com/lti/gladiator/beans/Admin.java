package com.lti.gladiator.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ADMINS")
public class Admin {
	
	@Id
	@SequenceGenerator(name = "seq_admin_gen", sequenceName = "seq_admin", allocationSize = 1)
	@GeneratedValue(generator = "seq_admin_gen")
	private int adminId;
	@Column(length=20)
	private String adminName;
	@Column(length=20)
	private String adminMobile;
	@Column(length=20)
	private String adminEmail;
	@Column(length=20)
	private String adminPassword;
	
	public Admin() {
		super();
	}

	public Admin(int adminId, String adminName, String adminMobile, String adminEmail, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminMobile = adminMobile;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}

	public Admin(String adminName, String adminMobile, String adminEmail, String adminPassword) {
		super();
		
		this.adminName = adminName;
		this.adminMobile = adminMobile;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminMobile() {
		return adminMobile;
	}

	public void setAdminMobile(String adminMobile) {
		this.adminMobile = adminMobile;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminMobile=" + adminMobile
				+ ", adminEmail=" + adminEmail + ", adminPassword=" + adminPassword + "]";
	}
	
	
	
}
