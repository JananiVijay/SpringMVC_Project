package comsciprep.jee;

public class UserValidationService {
	
	public boolean validateUser(String name, String password) {
		if(name.equalsIgnoreCase("Janani") && password.equals("password"))
			return true;
		return false;
	}
}
