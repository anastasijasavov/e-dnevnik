package uni.fmi.grades.student.model;

import static org.junit.Assert.assertEquals;

import uni.fmi.models.Subject;
import uni.fmi.student.GradePanelService;

public class GradePanelModel {
	
	
	private String subjectName;
	public GradePanelModel() {
		
	}
	
	public void clickSubject(String subjName) {		
		assertEquals(GradePanelService.findSubject(subjName), "Success");
		subjectName = subjName;
	}

	public void showGrades() {
		
		GradePanelService.showGrades(subjectName);
	}
}
