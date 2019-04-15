package assignment4;

import assignment4.controller.Controller;
import assignment4.model.PersonList;
import assignment4.view.AddPersonView;
import assignment4.view.PersonListView;

public class Runner {
    public static void main(String[] args) {
        AddPersonView addPersonView = new AddPersonView();
        PersonList personList = new PersonList();
        PersonListView personListView = new PersonListView();
        Controller personController = new Controller(personList, personListView, addPersonView);
    }
}
