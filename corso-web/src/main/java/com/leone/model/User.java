package com.leone.model;

import java.io.Serializable;

public class User implements Serializable {
	
	private final int id;
	private String username;
	private String email;
	private String password;
	
	public User(int id, String username, String email, String password){
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	

	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		
		return " "+ this.id + " " + this.username + " " + this.email + " " + this.password;
	}
	
	
	
}
