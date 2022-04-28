package com.leone.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Match implements Serializable {
	
	private final int id;
	private Date date;
	private List<User> players;
	private String fieldname;
	
	public Match(int id, Date date, List<User> players, Field fieldname ) {
		this.id = id;
		this.date = date;
		players = new ArrayList<User>();
		this.fieldname = fieldname.getName();
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<User> getPlayers() {
		return players;
	}

	public void setPlayers(List<User> players) {
		this.players = players;
	}

	public String getFieldname() {
		return fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public int getId() {
		return id;
	}
	
	

}
