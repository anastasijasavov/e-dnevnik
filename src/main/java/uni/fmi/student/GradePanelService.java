package uni.fmi.student;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import uni.fmi.models.*;

public class GradePanelService {

	private static Set<Grade> gradesDB = new HashSet<Grade>();
	private static List<Student> studentsDB = Collections.singletonList(new Student());
	private static List<Exam> examsDB = new ArrayList<Exam>();
	private static List<Subject> subjectsDB = new  ArrayList<Subject>();
	//dummy data for a grade and an exam
	
	
	
	
//	gradesDB.add(new Grade(6,"26/01/2019", studentsDB.get(1), exams.));
	public static Set<Grade> showGrades(String subject) {
		
		
		Set<Grade> filteredGrades = new HashSet<Grade>();
		for(Subject item: subjectsDB) {
			
			if(item.getName().equals(subject)) {
				filteredGrades = gradesDB.stream()
						.filter(g -> g.getExam().getSubject().getName().equals(subject))
						.collect(Collectors.toSet());
			}
		}
		
		return filteredGrades;
	}


	public static String findSubject(String subj) {
		
		subjectsDB.add(new Subject("Mechanics"));
		subjectsDB.add(new Subject("History"));
		 Exam exam = new Exam("Test1", subjectsDB.get(0));
		 Grade grade = new Grade(6, "26/01/2020", studentsDB.get(0), exam);
		gradesDB.add(grade);
		examsDB.add(exam);
		
		boolean subjectExists = subjectsDB.stream().anyMatch(s->s.getName().equals(subj));
		
		return subjectExists? "Success":"Something went wrong";
		
	}
}
