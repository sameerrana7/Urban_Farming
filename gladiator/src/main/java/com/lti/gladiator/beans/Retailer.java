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

	@Column(length=20)
	private String retailerName;

	@Column(length=20)
	private String retailerMail;

	@Column(length=20)
	private long retailerMobile;

	public Retailer() {
		super();
	}

	public Retailer(int retailerId, String retailerName, String retailerMail, long retailerMobile) {
		super();
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.retailerMail = retailerMail;
		this.retailerMobile = retailerMobile;
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

	public String getRetailerMail() {
		return retailerMail;
	}

	public void setRetailerMail(String retailerMail) {
		this.retailerMail = retailerMail;
	}

	public long getRetailerMobile() {
		return retailerMobile;
	}

	public void setRetailerMobile(long retailerMobile) {
		this.retailerMobile = retailerMobile;
	}

	@Override
	public String toString() {
		return "Retailer [retailerId=" + retailerId + ", retailerName=" + retailerName + ", retailerMail="
				+ retailerMail + ", retailerMobile=" + retailerMobile + "]";
	}

}
