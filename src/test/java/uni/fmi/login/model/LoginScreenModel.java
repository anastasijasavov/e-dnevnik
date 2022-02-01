package uni.fmi.login.model;

import uni.fmi.login.service.LoginService;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;
	
	public LoginScreenModel() {
		
	}

	public void setUsername(final String username) {
		this.username=username;
		
	}

	public void setPassword(final String pass) {
		this.password= pass;
	}

	public String getMessage() {
		return message;
	}

	public void clickLogin() {
		message= LoginService.login(username, password);
	}
}
