package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Parent extends User {

    private Set<Student> students;
    /**
     * Default constructor
     */
    public Parent() {
    }

    

    /**
     * @return
     */
    public Set<Student> getStudents() {
        return students;
    }

    /**
     * @param students 
     * @return
     */
    public void setStudents(Set<Student> students) {
        this.students=students;
    }

//if the given student belongs to a given parent write out the grades that the student has
    public Set<Grade> getStudentsGrades(Student student){

            Set<Grade> grades = new HashSet<Grade>();

            for(Student st: this.students){
                
                if(st.getFacultyNo()==student.getFacultyNo()){
                    grades = st.getGrades();
                }    
            }
            return grades;
    }

}