package assignment4.controller;

import assignment4.model.Person;
import assignment4.model.PersonList;

public class MainController {
    private static int counter = 0;
    public static void addPerson() {
        Person person = new Person();
        PersonList.addPerson(person);
    }
}
