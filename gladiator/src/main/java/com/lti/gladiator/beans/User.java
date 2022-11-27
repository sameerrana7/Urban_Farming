package com.lti.gladiator.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPSPRING")
public class User {
	@Id
	@Column(name = "")
	private int userId;
	@Column(name = "")
	private String userName;
	@Column(name = "")
	private String userMobileNumber;
	@Column(name = "")
	private String password;
	@Column(name = "")
	private String Address;

	public User(int userId, String userName, String userMobileNumber, String password, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMobileNumber = userMobileNumber;
		this.password = password;
		Address = address;
	}

	public User() {
		super();
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userMobileNumber=" + userMobileNumber
				+ ", password=" + password + ", Address=" + Address + "]";
	}

}
