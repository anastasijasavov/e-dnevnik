package uni.fmi.models;

/**
 * 
 */
public class Grade {


    private int gradeValue;
    private String inputDate;
    private Student student;
    private Exam exam;

    /**
     * Default constructor
     */
    public Grade() {
    }

    public Grade(int value, String date, Student student, Exam exam) {
    	this.gradeValue = value;
    	this.inputDate = date;
    	this.student = student;
    	this.exam = exam;
    }
    
    public Grade(int value, Student student) {
    	this.gradeValue = value;
    	this.student = student;
    }
    
    
    /**
     * @return
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student 
     * @return
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return
     */
    public int getGradeValue() {

        return this.gradeValue;
    }

    /**
     * @param grade 
     * @return
     */
    public void setGradeValue(int grade) {

        if((grade >= 2 && grade <= 6 ) && this.exam != null)
        this.gradeValue=grade;
    }

    /**
     * @return
     */
    public String getInputDate() {
        return this.inputDate;
    }

    /**
     * @param inputDate 
     * @return
     */
    public void setInputDate(String inputDate) {
        this.inputDate=inputDate;
    }

    public Exam getExam(){
        return this.exam;
    }

    public void setExam(Exam exam){
        this.exam = exam;
    }
}