package com.esprit.mcs.formation.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnection {

	private static MySqlConnection instance;
	private Connection connection;

	public MySqlConnection() {

	}

	public static MySqlConnection getInstance() {
	  if (instance==null)
		    instance = new MySqlConnection();
		return instance;
	}
	
	public void connect(DataSource  dataSource){
		
		
		  try {
			Class.forName(dataSource.getDriverClass()).newInstance();
			connection = DriverManager.getConnection(dataSource.getHost()+":"+dataSource.getPort()+"/"+dataSource.getDbName(),dataSource.getUserLogin(),dataSource.getUserPwd());
			
		} catch (InstantiationException e) {
			System.err.println("echec instention !");
		} catch (IllegalAccessException e) {
			System.err.println("echec  acces a la base !");
		} catch (ClassNotFoundException e) {
			System.err.println("echec class non trouver  !");
		} catch (SQLException e) {
			System.err.println("echec mysql wowh !");
		}
		
	}

	public int executeUpdate(String sql) {
		int affectedRows = 0;
		try {
			Statement stat = connection.createStatement();
			affectedRows = stat.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Erreur  excute update:" + e.getMessage());
		}

		return affectedRows;

	}

	public ResultSet executeQuery(String sql) {
		ResultSet rs = null;
		try {
			
			Statement stat = connection.createStatement();
			rs = stat.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("Erreur excute query :" + e.getMessage());
			e.printStackTrace();
		}
		return rs;
	}

}
