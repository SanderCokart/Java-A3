package assignment4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class PersonList extends Observable {
    private static List<Person> people = new ArrayList();

    public static void addPerson(Person person){
        people.add(person);
    }

    public List<Person> getPeople(){
        return people;
    }
}
