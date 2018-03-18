package com.comsciprep.login;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {

	public boolean validateUser(String name, String password) {
		if(name.equalsIgnoreCase("Janani") && password.equals("password"))
			return true;
		return false;
	}
}
