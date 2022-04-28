package com.leone.form;

import java.util.Date;

import com.leone.model.Field;

public class MatchForm {
	private Date date;
	private FieldForm field;
	
	
	
	public MatchForm(Date date, FieldForm field) {
		super();
		this.date = date;
		this.field = field;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFieldName() {
		return field.getName();
	}
	public void setField(FieldForm field) {
		this.field = field;
	}
	
	
	
}
