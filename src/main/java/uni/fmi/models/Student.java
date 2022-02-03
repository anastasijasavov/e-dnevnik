package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Student extends User {

    
    private String index;
    private Set<Grade> grades;
    private Class klas;
    private Set<Parent> parents;
    
    /**
     * Default constructor
     */
    public Student() {
    }
    
    public Student(String index) {
    	this.index = index;
    }
    /**
     * @return
     */
    public Set<Grade> getGrades() {
        return grades;
    }

    /**
     * @param grade 
     * @return
     */
    public void setGrades(Set<Grade> grades) {

        this.grades=grades;
    }

    /**
     * @return
     */
    public String getIndex() {
        return this.index;
    }

    /**
     * @param facultyNumber 
     * @return
     */
    public void setIndex(String facultyNumber) {
        this.index=facultyNumber;
    }

    /**
     * @return
     */
    public Set<Parent> getParents() {
        return this.parents;
    }

    /**
     * @param parents 
     * @return
     */
    public void setParents(Set<Parent> parents) {
        if(parents.size() <= 2)
        this.parents= parents;
    }

    public Class getCourse(){
        return this.klas;
    }

    public void setClass(Class klas){
        this.klas=klas;
    }
}