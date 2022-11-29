package com.lti.gladiator.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RETAILERS")
public class Retailer {

	@Id
	private int retailerId;

	@Column(length = 20)
	private String retailerName;

	@Column(length = 20)
	private String retailerEmail;

	@Column(length = 20)
	private String retailerMobile;

	@Column(length = 20)
	private String retailerPassword;

	public Retailer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retailer(int retailerId, String retailerName, String retailerEmail, String retailerMobile,
			String retailerPassword) {
		super();
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.retailerEmail = retailerEmail;
		this.retailerMobile = retailerMobile;
		this.retailerPassword = retailerPassword;
	}

	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	public String getRetailerEmail() {
		return retailerEmail;
	}

	public void setRetailerEmail(String retailerEmail) {
		this.retailerEmail = retailerEmail;
	}

	public String getRetailerMobile() {
		return retailerMobile;
	}

	public void setRetailerMobile(String retailerMobile) {
		this.retailerMobile = retailerMobile;
	}

	public String getRetailerPassword() {
		return retailerPassword;
	}

	public void setRetailerPassword(String retailerPassword) {
		this.retailerPassword = retailerPassword;
	}

	@Override
	public String toString() {
		return "Retailer [retailerId=" + retailerId + ", retailerName=" + retailerName + ", retailerEmail="
				+ retailerEmail + ", retailerMobile=" + retailerMobile + ", retailerPassword=" + retailerPassword + "]";
	}

}
