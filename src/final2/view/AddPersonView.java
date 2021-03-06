package final2.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class AddPersonView extends JFrame{
    public JTextField firstNameTextField;
    public JTextField birthdateTextField;
    public JTextField lastNameTextField;
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
