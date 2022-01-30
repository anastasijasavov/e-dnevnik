package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Teacher extends User {

    private String empDate;
    private Class klas;
    private Set<Subject> subjects;
    /**
     * Default constructor
     */
    public Teacher() {
    }

    

    /**
     * @return
     */
    public String getEmpDate() {
        return empDate;
    }

    /**
     * @param empDate 
     * @return
     */
    public void setEmpDate(String empDate) {
        this.empDate = empDate;
}
    /**
     * @return
     */
    public Set<Subject> getSubjects() {
        return subjects;
    }

    /**
     * @param subjects 
     * @return
     */
    public void setSubjects(Set<Subject> subjects) {
        this.subjects=subjects;
    }

    /**
     * @return
     */
    public Class getCourse() {
        return this.klas;
    }

    /**
     * @param class 
     * @return
     */
    public void setClass(Class klas) {
        this.klas=klas;
    }

}