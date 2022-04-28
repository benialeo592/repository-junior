package com.leone.service;

import java.sql.Connection;
import java.util.Date;

import com.leone.action.MatchDao;
import com.leone.form.FieldForm;
import com.leone.form.MatchForm;
import com.leone.model.Field;
import com.leone.utility.DatabaseConnect;

public class MatchService {

	public void createMatch(MatchForm mForm) {
		MatchDao mDao= new MatchDao();
		
		try(Connection con= DatabaseConnect.getConnection()){
			mDao.createMatch(mForm, con);
	}catch(Exception e) {
		e.printStackTrace();
		
		}
	}
}
