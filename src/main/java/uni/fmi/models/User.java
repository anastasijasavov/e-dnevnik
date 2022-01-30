package uni.fmi.models;
/**
 * 
 */
public class User {

    private String username;
    private String password;
    private String email;
    private String fName;
    private String lName;
    /**
     * Default constructor
     */
    public User() {
    }

    

    public User( final String username, final String pass) {
    	this.username = username;
    	this.password = pass;
    }



	/**
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        this.username=username;
    }

    /**
     * @return
     */
    public String getPass() {
        return password;
    }

    /**
     * @param pass 
     * @return
     */
    public void setPass(String pass) {
        this.password=pass;
    }

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    /**
     * @return
     */
    public String getFName() {
        return fName;
    }

    /**
     * @param fname 
     * @return
     */
    public void setFName(String fname) {
        this.fName = fname;
    }

    /**
     * @return
     */
    public String getLName() {
        return lName;
    }

    /**
     * @param lname 
     * @return
     */
    public void setLName(String lname) {
        this.lName = lname;
    }

}