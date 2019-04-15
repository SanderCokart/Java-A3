package assignment4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class PersonList extends Observable {

    private List<Person> list = new ArrayList<>();

    public List<Person> getList() {
        return list;
    }

    public void addPerson(Person person) {
        list.add(person);
    }

}
