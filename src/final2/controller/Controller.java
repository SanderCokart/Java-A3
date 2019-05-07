package final2.controller;

import final2.model.Database;
import final2.model.Person;
import final2.model.PersonList;
import final2.view.AddPersonView;
import final2.view.PersonListView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Controller {
    //VARIABLES
    private PersonList personList;
    private PersonListView personListView;
    private AddPersonView addPersonView;
    private Database database;

    public Controller(PersonList personList, PersonListView personListView, AddPersonView addPersonView, Database database) throws SQLException {
        //WHEN PROGRAM RUNS
        database.getConnection();
        personList = database.getAll();
        database.connectionClose();

        personListView.updateListModel(personList);

        //LOCAL VARIABLE ALLOCATION
        this.personList = personList;
        this.personListView = personListView;
        this.addPersonView = addPersonView;
        this.database = database;

        //ACTION LISTENERS
        this.personListView.addPersonButtonListener(new AddPersonListener());
        this.addPersonView.addPersonSubmitListener(new AddPersonSubmitListener());
    }

    //WHEN YOU CLICK ON ADD PERSON
    class AddPersonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            addPersonView.setVisible(true);
        }
    }

    //WHEN YOU SUBMIT THE FORM
    class AddPersonSubmitListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String firstname = addPersonView.getFirstNameTextField();
            String lastname = addPersonView.getLastNameTextField();
            String birthdate = addPersonView.getBirthdateTextField();


            Person person = new Person(firstname,lastname,birthdate);
            personList.addPerson(person);

            database.getConnection();
            database.addPerson(person);
            database.connectionClose();

            personListView.updateListModel(personList);

            addPersonView.firstNameTextField.setText("");
            addPersonView.lastNameTextField.setText("");
            addPersonView.birthdateTextField.setText("");
            addPersonView.dispose();
        }
    }
}
