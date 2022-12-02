package com.lti.gladiator.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
	@Id
	@SequenceGenerator(name = "seq_user_gen", sequenceName = "seq_user", allocationSize = 1)
	@GeneratedValue(generator = "seq_user_gen")
	private int userId;
	@Column(length = 20)
	private String userName;
	@Column(length = 20)
	private String userMobileNumber;
	@Column(length = 20)
	private String userEmail;
	@Column(length = 20)
	private String password;
	@Column(length = 20)
	private String Address;

	public User() {
		super();
	}

	public User(int userId, String userName, String userMobileNumber, String userEmail, String password,
			String Address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMobileNumber = userMobileNumber;
		this.userEmail = userEmail;
		this.password = password;

	this.Address = Address;
	}
	
	public User( String userName, String userMobileNumber, String userEmail, String password,
			String address) {
		super();
		
		this.userName = userName;
		this.userMobileNumber = userMobileNumber;
		this.userEmail = userEmail;
		this.password = password;
		this.Address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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



	public void setAddress(String Address) {
		this.Address = Address;
  }

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userMobileNumber=" + userMobileNumber
				+ ", userEmail=" + userEmail + ", password=" + password + ", Address=" + Address + "]";
	}

}
