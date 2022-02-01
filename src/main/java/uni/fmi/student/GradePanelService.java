package uni.fmi.student;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uni.fmi.models.*;

public class GradePanelService {

	private static List<Grade> gradesDB = new ArrayList<Grade>();
	private static List<Student> studentsDB = new ArrayList<Student>();
	private static List<Exam> examsDB = new ArrayList<Exam>();
	
	//dummy data for a grade and an exam
	static Exam exam = new Exam(new Subject("Cognitive robotics"), Collections.singleton(new Grade(6, studentsDB.get(0))));
	static Grade grade = new Grade(6, "26/01/2020", studentsDB.get(0), exam);
	
	
	public static String showPanel() {
		
		gradesDB.add(grade);
		examsDB.add(exam);
		
		return MessageFormat.format("Student: {0} ", studentsDB.get(0).getFName());
	}
//	gradesDB.add(new Grade(6,"26/01/2019", studentsDB.get(1), exams.));

}
