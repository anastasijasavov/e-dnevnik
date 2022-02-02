package uni.fmi.grades.professor;

import uni.fmi.models.Exam;
import uni.fmi.models.Student;
import uni.fmi.models.Subject;

public class AddGradeService {

	
	static final Student student = new Student();
	static Exam exam;
	String returnMsg;
	static int grade = 0;
	
	public static String AddGrade(String index, String gradeValue, String examName, String subjectName) {
		
		student.setIndex(Integer.parseInt(index));
		exam = new Exam(examName, new Subject(subjectName));
		if(gradeValue.isBlank())
			return "Please enter a grade";
			
		try {
			 grade = Integer.parseInt(gradeValue);
			
		} catch (Exception e) {
			return "Enter a whole number";
		}
		
		if(grade < 2 || grade > 6) {
			
			return "Enter a valid grade";
		}
		
		else return "Success";
		
	}

}
