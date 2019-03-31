package assignment4V2.view;

import assignment4V2.model.PersonList;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class PersonListView extends JFrame implements Observer {
    private JButton addPersonButton;
    private JList personList;
    private JPanel mainMenuPanel;

    public PersonListView(){
        this.setContentPane(mainMenuPanel);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void addPersonButtonListener(ActionListener listenForAddPersonButton){
        addPersonButton.addActionListener(listenForAddPersonButton);
    }


    @Override
    public void update(Observable o, Object arg) {
        PersonList p = (PersonList) o;
        personList.add(p);
    }
}
