package uni.fmi.student.grades;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import uni.fmi.login.service.LoginService;
import uni.fmi.student.grades.model.GradePanelModel;

public class GradePanelSteps {

	GradePanelModel gradeModel = new GradePanelModel();
	
	@Given("^Student is logged in$")
	public String checkLogin() throws Throwable {
		
		String returnString = "Successful login";
		
		if(LoginService.login("anastasijasavov", "p4ssw0rd")==returnString) 
			return returnString;
		
		return null;
		
	}

	@When("^user clicks on subject$")
	public void clickSubjectButton() throws Throwable {
		gradeModel.clickSubject();
	}

	@Then("^show grades from subject: \"([^\"]*)\"$")
	public void showGradesForSubject(final String subjectName) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
