package com.userfront;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.userfront.controller.AuthentificationController;
import com.userfront.controller.DataBaseConnection;

@RunWith(MockitoJUnitRunner.class)
public class AuthentificationTest {
	
	
	AuthentificationController login;
	
	 @Mock
	private DataBaseConnection dbConnection;
	
	@Before
	public void setUp() throws Exception {
		login = new AuthentificationController();
		login.setDbConnection(dbConnection);
	}
	
	@After
	public void tearDown() {
		
	}
	@Test
	public void isCorrectUserName() {
		String username="soufiane";
		String usernameNotCorr="abc";
		when(dbConnection.checkUsername(username)).thenReturn(true);
		when(dbConnection.checkUsername(usernameNotCorr)).thenReturn(false);
		assertTrue(login.isCorrectLogin(username));
		assertFalse(login.isCorrectLogin(usernameNotCorr));
	}
	
	@Test
	public void isCorrectUserNamePassword() {
		String username="soufiane";
		String password="abahcine";
		String usernameCorrect="machhour";
		String passwordNotCorrect="aba";
		when(dbConnection.checkUsernamePassword(username, password)).thenReturn(true);
		when(dbConnection.checkUsernamePassword(usernameCorrect, password)).thenReturn(false);
		assertTrue(login.isCorrectLoginPassword(username, password));
		assertFalse(login.isCorrectLoginPassword(usernameCorrect, passwordNotCorrect));
	}
	
	
	
	
	
	
	

}
