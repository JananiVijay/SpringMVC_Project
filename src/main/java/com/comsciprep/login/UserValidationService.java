package com.comsciprep.login;

public class UserValidationService {
	
	public boolean validateUser(String name, String password) {
		if(name.equalsIgnoreCase("Janani") && password.equals("password"))
			return true;
		return false;
	}
}
