package assignment4.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class PersonListView extends JFrame implements Observer {
    private JButton addPersonButton;
    public JList personList;
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

    }
}
