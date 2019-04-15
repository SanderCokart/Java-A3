package assignment4.controller;

import assignment4.model.Person;
import assignment4.model.PersonList;
import assignment4.view.AddPersonView;
import assignment4.view.PersonListView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
            System.out.println(personList.getList());

            DefaultListModel listModel = new DefaultListModel();

            for (int i = 0; i < personList.getList().size(); i++) {
                listModel.addElement(personList.getList().get(i).export());
            }

            personListView.personList.setModel(listModel);

            addPersonView.firstNameTextField.setText("");
            addPersonView.lastNameTextField.setText("");
            addPersonView.birthdateTextField.setText("");
            addPersonView.dispose();
        }
    }
}
