package assignment4.model;

public class Person {
    private String firstname;
    private String lastname;
    private String birthdate;

    //SETTERS & GETTERS
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getFirstname() {return firstname;}

    public void setLastname(String lastname) {this.lastname = lastname;}
    public String getLastname() {return lastname;}

    public void setBirthdate(String birthdate) {this.birthdate = birthdate;}
    public String getBirthdate() {return birthdate;}

    public String toString(){
        return  firstname + " " + lastname;
    }
}
