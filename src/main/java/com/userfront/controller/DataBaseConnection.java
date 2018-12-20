package com.userfront.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;

public interface DataBaseConnection {
	
	boolean checkUsernamePassword(String username, String password);
	boolean checkUsername(String username);


}
