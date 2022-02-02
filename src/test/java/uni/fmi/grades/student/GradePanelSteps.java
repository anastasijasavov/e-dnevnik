package uni.fmi.grades.student;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.*;
import uni.fmi.login.service.LoginService;
import uni.fmi.grades.student.model.GradePanelModel;

public class GradePanelSteps {

	GradePanelModel gradeModel = new GradePanelModel();
	//Subject selectedSubject;
	
	@Given("^Student is logged in$")
	public void checkLogin() throws Throwable {
		
		String returnString = "Successful login";
		assertEquals(returnString,LoginService.login("anastasijasavov", "p4ssw0rd"));
	
	}
		
	@When("^user clicks on subject: \"([^\"]*)\"$")
	public void clickSubjectButton(final String subjName) throws Throwable {
		
		gradeModel.clickSubject(subjName);
		//selectedSubject = new Subject(subjName);
	}

	@Then("^show grades from subject$")
	public void showGrades() throws Throwable {
		gradeModel.showGrades();
	}

}
