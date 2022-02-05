package uni.fmi.grades.professor;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.grades.professor.model.AddGradeModel;

public class AddGradeSteps {

	private AddGradeModel addGradeModel;
	
//	@Given("^teacher is logged in$")
//	public void checkLogin() throws Throwable {
//	    
//	}

	@Given("^grade form shown$")
	public void showGradeForm() throws Throwable {
	     addGradeModel = new AddGradeModel();
	}

	@When("^inputs students index: \"([^\"]*)\"$")
	public void setIndex(String index) throws Throwable {
	   addGradeModel.setIndex(index);
	}
	
	@When("^inputs grade: \"([^\"]*)\"$")
	public void setGrade(String grade) throws Throwable {
	    addGradeModel.setGrade(grade);
	}

	@When("^inputs exam name: \"([^\"]*)\"$")
	public void setExamName(String examName) throws Throwable {
	    addGradeModel.setExam(examName);
	}

	@When("^inputs subject: \"([^\"]*)\"$")
	public void setSubject(String subjectName) throws Throwable {
	    addGradeModel.setSubject(subjectName);
	}
	
	@When("^clicks submit button$")
	public void clickSubmitBtn() throws Throwable {
	    addGradeModel.submitForm();
	}


	@Then("^show message: \"([^\"]*)\"$")
	public void showMessage(String message) throws Throwable {
	    assertEquals(message, addGradeModel.getMessage());
	}

}
