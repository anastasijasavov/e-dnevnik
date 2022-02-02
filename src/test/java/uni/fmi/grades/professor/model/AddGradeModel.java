package uni.fmi.grades.professor.model;

import uni.fmi.grades.professor.AddGradeService;

public class AddGradeModel {

	private String index, subjectName, examName, returnMessage;
	private String gradeValue;
	
	public AddGradeModel() {
		
	}

	public void setIndex(String index2) {
		this.index = index2;
	}

	public void setGrade(String grade) {
		this.gradeValue = grade;
	}

	public void setExam(String examName2) {
		this.examName = examName2;
	}

	public void setSubject(String subjectName2) {
		this.subjectName = subjectName2;
	}

	public void submitForm() {
		returnMessage = AddGradeService.AddGrade(index, gradeValue, examName, subjectName);
	}

	public String getMessage() {
		
		return returnMessage;
	}
	
}
