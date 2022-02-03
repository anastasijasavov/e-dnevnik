package uni.fmi.login.service;

import java.util.Collections;
import java.util.List;

import uni.fmi.models.User;

public class LoginService {

	private static List<User> usersDB = Collections.singletonList(new User("anastasijasavov", "p4ssw0rd"));
	
	public static String login(String username, String password) {
		
		if((username == null || username.isBlank()) && (password == null || password.isBlank()))
			return "Enter username and password.";
		
		
		if(password == null || password.isBlank())
			return "Enter password";
		
		if(username == null || username.isBlank())
			return "Enter username";
		
		boolean userExists = usersDB.stream()
				.anyMatch(u->u.getUsername().equals(username) && u.getPass().equals(password));
		
		return userExists? "Successful login" : "Wrong username and/or password.";
	}
}
