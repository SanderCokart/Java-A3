package assignment4V2;

import assignment4V2.controller.Controller;
import assignment4V2.model.PersonList;
import assignment4V2.view.AddPersonView;
import assignment4V2.view.PersonListView;

public class Runner {
    public static void main(String[] args) {
        PersonListView personListView = new PersonListView();
        AddPersonView addPersonView = new AddPersonView();
        PersonList personList = new PersonList();
        Controller personController = new Controller(personList, personListView, addPersonView);


    }
}
