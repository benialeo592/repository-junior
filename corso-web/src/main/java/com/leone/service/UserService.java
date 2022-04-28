package com.leone.service;

import java.sql.Connection;
import java.sql.SQLException;
import com.leone.action.UserDao;
import com.leone.form.SubscriptionForm;
import com.leone.model.User;
import com.leone.utility.DatabaseConnect;



public class UserService{
	
	public void createUser(SubscriptionForm u) {
		UserDao uDao=new UserDao();
		try(Connection con= DatabaseConnect.getConnection()) {
			uDao.createUser(u, con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/*
	public void recuperaDatiUtente(String username) {
		UtenteDao uDao=new UtenteDao();
		try(Connection con=DBConnect.getConnection()) {
			uDao.recuperaDatiDaUsername(username,con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Utente creaUtenteRecuperandoDatiUtente(String username) {
		Utente u = null;
		UtenteDao uDao=new UtenteDao();
		try(Connection con=DBConnect.getConnection()) {
			u = uDao.recuperaDatiDaUsername(username,con);
		}catch(Exception e) {
			e.printStackTrace();
		
		}
		return u;
		
	}*/
	
	
}
