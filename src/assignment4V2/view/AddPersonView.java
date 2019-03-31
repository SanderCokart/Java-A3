package assignment4V2.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class AddPersonView extends JFrame{
    private JTextField firstNameTextField;
    private JTextField birthdateTextField;
    private JTextField lastNameTextField;
    private JPanel AddPersonView;
    private JButton addPersonSubmitButton;

    public AddPersonView(){
        this.setContentPane(AddPersonView);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,150);
        this.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    public String getFirstNameTextField() {
        return firstNameTextField.getText();
    }

    public String getLastNameTextField() {
        return lastNameTextField.getText();
    }

    public String getBirthdateTextField() {
        return birthdateTextField.getText();
    }

    public void addPersonSubmitListener(ActionListener listenForAddPersonSubmitButton){
        addPersonSubmitButton.addActionListener(listenForAddPersonSubmitButton);
    }
}
