package uni.fmi.grades.professor;

import java.util.Collections;
import java.util.List;

import uni.fmi.models.Exam;
import uni.fmi.models.Student;
import uni.fmi.models.Subject;

public class AddGradeService {

	
	static final Student student = new Student();
	static Exam exam;
	//String returnMsg;
	static int grade = 0;
	
	private static List<Student> studentsDB = Collections.singletonList(new Student("1901111096"));
	
	public static String AddGrade(String index, String gradeValue, String examName, String subjectName) {
		
		student.setIndex(index);
		exam = new Exam(examName, new Subject(subjectName));
		
		//if student with given index does'nt exist
		boolean studentExists = studentsDB.stream().anyMatch(s -> s.getIndex().equals(index));
		if(!studentExists)
			return "Student doesnt exist";
		
		
		//if grade field is empty
		if(gradeValue.isBlank())
			return "Please enter a grade";
			
		//if grade is not a whole number
		try {
			 grade = Integer.parseInt(gradeValue);
			
		} catch (Exception e) {
			return "Enter a whole number";
		}
		
		//if grade is outside of allowed bounds
		if(grade < 2 || grade > 6) {
			
			return "Enter a valid grade";
		}
		
		else return "Success";
		
	}

}
