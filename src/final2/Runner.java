package final2;

import final2.controller.Controller;
import final2.model.Database;
import final2.model.PersonList;
import final2.view.AddPersonView;
import final2.view.PersonListView;

import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) throws SQLException {
        AddPersonView addPersonView = new AddPersonView();
        PersonList personList = new PersonList();
        PersonListView personListView = new PersonListView();
        Database database = new Database();
        Controller personController = new Controller(personList, personListView, addPersonView, database);
    }
}
