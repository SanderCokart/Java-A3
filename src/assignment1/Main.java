package assignment1;

import assignment1.classes.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setBirthday("25-04-1998");
        person1.setFirstName("Sander");
        person1.setLastName("Cokart");
        System.out.println(person1.getAttributes());
    }
}
