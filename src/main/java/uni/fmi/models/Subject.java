package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Subject {

    
    private String name;
    private Set<Class> classes;
    private Set<Teacher> teachers;
    private Set<Exam> exams;

    /**
     * Default constructor
     */
    public Subject() {
    }


    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public Set<Teacher> getTeachers() {
        return this.teachers;
    }

    /**
     * @param teachers 
     * @return
     */
    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
    /**
     * @return
     */
    public Set<Exam> getExams(){
        return exams;
    }

    /**
     * @param exams 
     * @return
     */
    public void setExams(Set<Exam> exams){
        this.exams = exams;
    }
    
    /**
     * @return
     */
    public Set<Class> getClasses(){
        return classes;
    }

    /**
     * @param exams 
     * @return
     */
    public void setClasses(Set<Class> classes){
        this.classes = classes;
    }

   
}