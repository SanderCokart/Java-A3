package final2.view;

import final2.model.PersonList;

import javax.swing.*;
import java.awt.event.ActionListener;

public class PersonListView extends JFrame {
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

    public JList getPersonList() {
        return personList;
    }

    public void addPersonButtonListener(ActionListener listenForAddPersonButton){
        addPersonButton.addActionListener(listenForAddPersonButton);
    }

    public void updateListModel(PersonList personList){
        System.out.println(personList.getList());

        DefaultListModel listModel = new DefaultListModel();

        for (int i = 0; i < personList.getList().size(); i++) {
            listModel.addElement(personList.getList().get(i).export());
        }

        this.personList.setModel(listModel);
    }
}
