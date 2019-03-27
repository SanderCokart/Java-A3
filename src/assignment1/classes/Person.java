package assignment1.classes;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private String birthday;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getBirthday() {return birthday;}

    public void setBirthday(String birthday) {this.birthday = birthday;}

    public String getAttributes(){
        return getFirstName()+"\n"+
                getLastName()+"\n"+
                getBirthday()+"\n"+
                getAge();
    }

    public int getAge(){
        String birthday = this.birthday;
        String[] dateNumbers = birthday.split("-");

        int day = Integer.parseInt(dateNumbers[0]);
        int month = Integer.parseInt(dateNumbers[1]);
        int year = Integer.parseInt(dateNumbers[2]);

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year,month,day);
        return Period.between(birthDate,today).getYears();
    }
}
