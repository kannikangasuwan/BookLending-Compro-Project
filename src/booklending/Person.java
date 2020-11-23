package booklending;

/**
 * Myclass
 * @author Chadarporn
 */
public class Person {

    private String firstname;
    private String lastname;
    private String idMember;

    /**
     * 
     * @param firstname of user
     * @param lastname of user
     * @param idMember of user
     */
    public Person(String firstname, String lastname, String idMember) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.idMember = idMember;
    }

    /**
     * 
     * @param firstname of user
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * 
     * @param lastname of user
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * 
     * @return firstname of user
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * 
     * @return lastname of user
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * 
     * @return idMember
     */
    public String getIdMember() {
        return this.idMember;
    }

    /**
     * print Name and ID Member
     */
    public void displayPerson() {
        System.out.println("Name : " + this.getFirstname() + "  " + this.getLastname());
        System.out.println("ID Member : " + this.getIdMember());
    }

}
