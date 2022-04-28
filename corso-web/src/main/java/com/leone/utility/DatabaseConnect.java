package com.leone.utility;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;



public class DatabaseConnect {
	
	private static Connection con;
	
	public static Connection getConnection() throws SQLException  {
		if(con == null) {
			MysqlDataSource dataSource = new MysqlDataSource();
			
			dataSource.setDatabaseName("padel");
			dataSource.setPort(3306);
			dataSource.setServerName("127.0.0.1");
			dataSource.setUser("root");
			dataSource.setPassword("admin");
			con = dataSource.getConnection();
		
		}
		
		return con;
	}

}
