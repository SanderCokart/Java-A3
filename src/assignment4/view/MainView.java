package assignment4.view;

import assignment4.controller.MainController;
import assignment4.model.Person;
import assignment4.model.PersonList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MainView extends JFrame implements Observer {
    private JList personList;
    public JPanel mainPanel;
    private JButton addButton;

    public MainView() {
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(mainPanel);
        this.setVisible(true);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainController.addPerson();
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {
        PersonList p = (PersonList) o;
        DefaultListModel<Person> listModel =new DefaultListModel<Person>();
        personList.setModel(listModel);
        //for loop alle personen eruit halen en op het scherm zetten
        for (Person next : p.getPeople()){
            listModel.addElement(next);
        }
    }
}