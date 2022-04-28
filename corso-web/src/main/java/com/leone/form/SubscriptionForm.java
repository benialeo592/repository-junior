package com.leone.form;

public class SubscriptionForm {
	
	private String username;
	private String email;
	private String password1;
	private String password2;

	

	public SubscriptionForm(String username, String email, String password1) {
		super();
		this.username = username;
		this.email = email;
		this.password1 = password1;
	}

	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword1() {
		return password1;
	}
	
	public String getPassword2() {
		return password2;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

}
