package com.leone.action;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.leone.form.MatchForm;

public class MatchDao {

	public void createMatch(MatchForm m, Connection con) {
		try {
			PreparedStatement ps = con.prepareStatement("INSERT into MATCHS (DATA, FIELDNAME, PLAYER1NAME, PLAYER2NAME, PLAYER3NAME, PLAYER4NAME) VALUES ( ? , ? , ? , ? , ? , ? )", Statement.RETURN_GENERATED_KEYS);
			
			java.sql.Date sqlDate = new java.sql.Date(m.getDate().getTime());
			ps.setDate(1, sqlDate);
			ps.setString(2, m.getFieldName());
			ps.setString(3, null);
			ps.setString(4, null);
			ps.setString(5, null);
			ps.setString(6, null);
			ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
