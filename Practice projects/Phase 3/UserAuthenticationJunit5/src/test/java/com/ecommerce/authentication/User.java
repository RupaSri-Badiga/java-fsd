package com.ecommerce.authentication;


public class User {
	
	public boolean login(String username, String password) 
	{
			return "admin".equals(username) && "password".equals(password);
	}
}