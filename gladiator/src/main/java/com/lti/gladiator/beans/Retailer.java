package com.lti.gladiator.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Retailers")
public class Retailer {

	@Id
	@Column(name = "RETAILER_ID")
	private int retailId;

	@Column(name = "RETAILER_NAME")
	private String retailName;

	@Column(name = "RETAILER_EMAIL")
	private String retailMail;

	@Column(name = "RETAILER_PHONE")
	private long retailMobile;

	public Retailer() {
		super();
	}

	public Retailer(int retailId, String retailName, String retailMail, long retailMobile) {
		super();
		this.retailId = retailId;
		this.retailName = retailName;
		this.retailMail = retailMail;
		this.retailMobile = retailMobile;
	}

	public int getRetailId() {
		return retailId;
	}

	public void setRetailId(int retailId) {
		this.retailId = retailId;
	}

	public String getRetailName() {
		return retailName;
	}

	public void setRetailName(String retailName) {
		this.retailName = retailName;
	}

	public String getRetailMail() {
		return retailMail;
	}

	public void setRetailMail(String retailMail) {
		this.retailMail = retailMail;
	}

	public long getRetailMobile() {
		return retailMobile;
	}

	public void setRetailMobile(long retailMobile) {
		this.retailMobile = retailMobile;
	}

	@Override
	public String toString() {
		return "Retailer [retailId=" + retailId + ", retailName=" + retailName + ", retailMail=" + retailMail
				+ ", retailMobile=" + retailMobile + "]";
	}

}
