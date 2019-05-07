package final2.model;

import java.util.ArrayList;
import java.util.List;

public class PersonList{

    private List<Person> list = new ArrayList<>();

    public List<Person> getList() {
        return list;
    }

    public void addPerson(Person person) {
        list.add(person);
    }

}
