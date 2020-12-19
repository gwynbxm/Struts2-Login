/**
 * 
 */
package ase.gp3.controller;

import java.io.*;
import java.sql.*;
import java.util.*;

import com.opensymphony.xwork2.ActionSupport;

import ase.gp3.controller.LoginAction;
import ase.gp3.model.User;
import ase.gp3.utils.DbConnect;

/** 
 * Programmer: Gwyn Bong Xiao Min
 * Date created: 14 Dec 2020, 6:26:01 pm
 * Date modified: 19 Dec 2020, 8:08:19 pm
 */
public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private Connection dbConnection;
	
	private static final String SUCCESS = "success";
	private static final String FAILED = "error";
	
	Properties prop = new Properties();
	InputStream inputStrm = LoginAction.class.getClassLoader().getResourceAsStream("properties");
	
	private User users = new User();


	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public LoginAction() {
		try {
			dbConnection = DbConnect.getSqlConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String execute() throws Exception {
		boolean success = checkCredentials(users.getUsername(), users.getPassword()); 
		if(success) {
			return SUCCESS;
		} else {
			addActionError("User cannot be found! Please re-enter username and password again!");
			return ERROR;
		}
	}
	
	public boolean checkCredentials(String username, String password) throws Exception {
		boolean validCred = false;
		Connection conn;
		String SQL_QUERY = "SELECT * FROM Users WHERE username = ? and password = ?";
		
		try {
			conn = dbConnection;
			PreparedStatement statement = conn.prepareStatement(SQL_QUERY);
			statement.setString(1, username);
			statement.setString(2, password);
			
			ResultSet resultset = statement.executeQuery(); 
			
			if(resultset.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Validation error: " + e.getMessage());
		}	
		return validCred;
	}
}
