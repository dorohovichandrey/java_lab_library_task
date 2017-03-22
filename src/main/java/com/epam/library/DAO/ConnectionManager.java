package com.epam.library.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.epam.library.exception.DAOException;

public class ConnectionManager {

	private static Connection connection;

    public static Connection getConnection() throws DAOException, SQLException {
    	
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/com.epam.library?autoReconnect=true&useSSL=false",
				"root", "7102555andre");
		
		return connection;
    }
		
}
