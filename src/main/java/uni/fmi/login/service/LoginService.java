package uni.fmi.login.service;

import java.util.Collections;
import java.util.List;

import uni.fmi.models.User;

public class LoginService {

	private static List<User> usersDB = Collections.singletonList(new User("anastasijasavov", "p4ssw0rd"));
	
	public static String login(String username, String password) {
		boolean userExists = usersDB.stream()
				.anyMatch(u->username.equals(u.getUsername()) && password.equals(u.getPass()));
		return userExists? "Successful login" : null;
	}
}
