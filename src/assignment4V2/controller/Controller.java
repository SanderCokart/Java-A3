package assignment4V2.controller;

import assignment4V2.model.Person;
import assignment4V2.model.PersonList;
import assignment4V2.view.AddPersonView;
import assignment4V2.view.PersonListView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Controller {
    private PersonList personList;
    private PersonListView personListView;
    private AddPersonView addPersonView;

    public Controller(PersonList personList, PersonListView personListView, AddPersonView addPersonView){
        this.personList = personList;
        this.personListView = personListView;
        this.addPersonView = addPersonView;

        this.personListView.addPersonButtonListener(new AddPersonListener());
        this.addPersonView.addPersonSubmitListener(new AddPersonSubmitListener());
    }

    class AddPersonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            addPersonView.setVisible(true);
        }
    }

    class AddPersonSubmitListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String firstname = addPersonView.getFirstNameTextField();
            String lastname = addPersonView.getLastNameTextField();
            String birthdate = addPersonView.getBirthdateTextField();

            Person person = new Person(firstname,lastname,birthdate);
            personList.addPerson(person);

            addPersonView.dispose();
        }
    }
}
