package uni.fmi.login;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.login.model.LoginScreenModel;

public class LoginSteps {
	private LoginScreenModel loginModel;

	@Given("^User opens a screen for login$")
	public void openLoginScreen() throws Throwable {
		loginModel = new LoginScreenModel();
	}

	@When("^inputs username$")
	public void addUsername() throws Throwable {
		loginModel.setUsername("anastasijasavov");
	}

	@When("^inputs pass$")
	public void addPassword() throws Throwable {
		loginModel.setPassword("p4ssw0rd");
	}

	@When("^clicks on login button$")
	public void clickLogin() throws Throwable {
		loginModel.clickLogin();
	}

	@Then("^sees succesful login screen$")
	public void showSuccess() throws Throwable {
		assertEquals("Successful login", loginModel.getMessage());
	}

	@Then("^sees error message$")
	public void checkForMissingDataMessage() throws Throwable {
		assertEquals("Enter username and password.", loginModel.getMessage());

	}

	@When("^inputs wrong username$")
	public void inputWrongUsername() throws Throwable {
		loginModel.setUsername("anastasija");
	}

	@Then("^sees error message for wrong credentials$")
	public void showWrongCredentialsMsg() throws Throwable {
		assertEquals("Wrong username and/or password.", loginModel.getMessage());
	}

}
