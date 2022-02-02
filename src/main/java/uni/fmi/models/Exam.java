package uni.fmi.models;

import java.util.*;

public class Exam {

	private String examDate;
	private String name;
	private Subject subject;
	//private Set<Grade> grades;

	public Exam() {

	}

	public Exam(String name, Subject subject) {
		this.name= name;
		this.subject = subject;
		//this.grades = grades;
	}
	
//	public Exam(Subject subject) {
//		this.subject = subject;
//	}
//	
	public Exam(String date, String name, Subject subject) {
		this.name= name;
		this.examDate = date;
		this.subject = subject;
		//this.grades = grades;
	} 
	/**
	 * @return
	 */
	public String getExamDate() {
		return examDate;
	}

	/**
	 * @param date
	 * @return
	 */
	public void setExamDate(String date) {
		this.examDate = date;
	}

	/**
	 * @return
	 */
	public String getExamName() {
		return name;
	}

	/**
	 * @param name
	 * @return
	 */
	public void setExamName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public Subject getSubject() {
		return this.subject;
	}

	/**
	 * @param subj
	 * @return
	 */
	public void setSubject(Subject subj) {
		this.subject = subj;
	}

//	public Set<Grade> getGrades() {
//		return this.grades;
//	}
//
//	public void setGrades(Set<Grade> grades) {
//		this.grades = grades;
//	}
}