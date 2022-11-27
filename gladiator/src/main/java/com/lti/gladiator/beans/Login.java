package com.lti.gladiator.beans;

public class Login {

	private String mail;
	private String password;

	public Login() {
		super();
	}

	public Login(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [mail=" + mail + ", password=" + password + "]";
	}

}
