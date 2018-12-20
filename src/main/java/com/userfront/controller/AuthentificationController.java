package com.userfront.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AuthentificationController {
	
	private DataBaseConnection dbConnection;
	
	

	public void setDbConnection(DataBaseConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	Map<String,String>users;
	
	public AuthentificationController() {
		users=new HashMap<>();
		users.put("soufiane", "abahcine");
		users.put("admin", "admin");
		users.put("mohamed", "machhour");
			
	}
	
	public boolean isCorrectLoginPassword(String username,String password) {
		if(isCorrectLogin(username)) {
			return users.get(username).equals(password);
		}
		return false;
	}
	
	public boolean isCorrectLogin(String login) {
		if(users.get(login)!=null) {
			return true;
		}
		return false;
	}
	
	public String getLogin() {
		int rand= new Random().nextInt(users.size());
		String key= (String) users.keySet().toArray()[rand];
		return key;
	}
	
	public String getPassword(String login) {
		return users.get(login);
	}
	
	
	

}
