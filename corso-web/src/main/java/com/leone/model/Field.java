package com.leone.model;

import java.io.Serializable;

public class Field implements Serializable {
	
	private final int id;
	private String name;
	private String address;
	
	
	
	public Field() {
		super();
		this.id = 0;	
	}

	public Field(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}
	

	@Override
	public String toString() {
		
		return " "+ this.id + " " + this.name + " " + this.address + " ";
	}
}

