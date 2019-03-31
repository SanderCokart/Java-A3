package assignment4V2.model;

public class Person {
    private String firstname;
    private String lastname;
    private String birthdate;

    public Person(String firstname, String lastname, String birthdate){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public String export(){
        return firstname + " " + lastname + " " + "his/her birthday = " + birthdate;
    }
}
