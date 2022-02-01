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

	@When("^inputs username: \"([^\"]*)\"$")
	public void addUsername(final String username) throws Throwable {
		loginModel.setUsername(username);
	}

	@When("^inputs pass: \"([^\"]*)\"$")
	public void addPassword(final String pass) throws Throwable {
		loginModel.setPassword(pass);
	}

	@When("^clicks on login button$")
	public void clickLogin() throws Throwable {
		loginModel.clickLogin();
	}

	@Then("^sees: \"([^\"]*)\"$")
	public void showSuccess(final String message) throws Throwable {
		assertEquals(message, loginModel.getMessage());
	}

	

}
