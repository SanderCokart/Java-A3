package final1.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class WinView extends JFrame {
    private JPanel winPanel;
    private JLabel winLabel;
    private JButton exitButton;
    //GENERATES INTERFACE ITEMS

    public WinView() {
        this.setContentPane(winPanel);//SETS CONTENT PANEL
        this.setLocationRelativeTo(null);//CENTERS THE VIEW
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CLOSE OPPERATION
        this.setSize(1000, 500);//SIZE
        this.setVisible(false);//DOES NOT RENDER THE SCREEN UPON CREATION OF OBJECT
    }

    public void addExitButtonListener(ActionListener listenForExitButton) {//METHOD THAT TAKES AN ACTION LISTENER AND ASSIGNS IT TO THE EXIT BUTTON;
        exitButton.addActionListener(listenForExitButton);
    }
}
