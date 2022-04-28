package com.leone.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.leone.form.SubscriptionForm;
import com.leone.model.User;
import com.leone.utility.DatabaseConnect;

public class UserDao {

	public User getUserByNameAndPass(String username, String password) throws SQLException {
		
		Connection con = DatabaseConnect.getConnection();
		User u = null;
		PreparedStatement ps = con.prepareStatement("SELECT * from UTENTE where USERNAME = ? and PASSWORD = ?");
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();	
		if(rs.next()) {
			 u = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)); 
		}
				
		rs.close();
		ps.close();	
		return u;
		
	}
	
	private static boolean isUserExists(SubscriptionForm userForm, Connection con) throws SQLException {
		
		boolean exist;
		PreparedStatement ps = con.prepareStatement("SELECT * from UTENTE where USERNAME = ? or EMAIL =?");
		ps.setString(1, userForm.getUsername());
		ps.setString(2, userForm.getEmail());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			exist = true;
		}else {
			exist = false;
		}
		
		rs.close();
		ps.close();	
		return exist;
		
		
	}
	
	public void createUser(SubscriptionForm user, Connection con) throws SQLException {
		
		if(!UserDao.isUserExists(user, con)) {
		PreparedStatement ps = con.prepareStatement("INSERT into UTENTE (USERNAME, EMAIL, PASSWORD) VALUES ( ? , ? , ? )", Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getEmail());
		ps.setString(3, user.getPassword1());
		ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		rs.close();
		ps.close();	
		}
		
	}
	
	public void deleteUser(SubscriptionForm user, Connection con) throws SQLException {
	
		if(UserDao.isUserExists(user, con)){
			
			PreparedStatement ps = con.prepareStatement("DELETE from UTENTE where USERNAME = ? and IDUTENTE > 0");
			ps.executeUpdate();
			ps.close();
			
		}

	}
	
	
}
