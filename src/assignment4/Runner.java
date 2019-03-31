package assignment4;

import assignment4.controller.MainController;
import assignment4.model.PersonList;
import assignment4.view.MainView;

import javax.swing.*;

public class Runner {
    public static void main(String[] args) {
        MainView view = new MainView();
        MainController controller = new MainController();
        PersonList list = new PersonList();
        list.addObserver(view);



    }
}
