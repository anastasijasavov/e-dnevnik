package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Class {


    private String name;
    private Teacher teacher; 
    private Set<Subject> subjects; 
    private Set<Student> students;


    /**
     * Default constructor
     */
    public Class() {
    }

    

    /**
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name=name;
    }

    /**
     * @return
     */
    public Teacher getTeacher() {
        return this.teacher;
    }

    /**
     * @param teacher 
     * @return
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    /**
     * @return
     */
    public Set<Student> getStudents(){
        return this.students;
    }
    /**
     * @param students 
     * @return
     */
    public void setStudents(Set<Student> students){
        this.students = students;
    }
    /**
     * @return
     */
    public Set<Subject> getSubjects(){
        return subjects;
    }
    /**
     * @param subjects 
     * @return
     */
    public void setSubjects(Set<Subject> subjects){
        this.subjects = subjects;
    }
}