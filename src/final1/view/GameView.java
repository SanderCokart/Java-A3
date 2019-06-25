package final1.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GameView extends JFrame {
    private JPanel gamePanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton[] buttons = new JButton[16];
    //CREATES BUTTONS AND SETS THEM IN AN ARRAY;

    public GameView() {
        buttons[0] = button1;
        buttons[1] = button2;
        buttons[2] = button3;
        buttons[3] = button4;
        buttons[4] = button5;
        buttons[5] = button6;
        buttons[6] = button7;
        buttons[7] = button8;
        buttons[8] = button9;
        buttons[9] = button10;
        buttons[10] = button11;
        buttons[11] = button12;
        buttons[12] = button13;
        buttons[13] = button14;
        buttons[14] = button15;
        buttons[15] = button16;
        //PUTS THE BUTTONS IN AN ARRAY UPON THE CREATION OF THE GAMEVIEW;

        this.setLocationRelativeTo(null);//CENTERS THE VIEW;
        this.setSize(500, 700);//SIZE;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CLOSE OPPERATION;
        this.setContentPane(gamePanel);//SETS CONTENT PANEL;
        this.setVisible(true);//SETS THE VIEW VISABLE;
        this.setResizable(false);//PREVENTS THE WINDOW FROM BEING RESIZED;
    }

    public JButton[] getButtons() {
        return buttons;
    }//RETURNS THE BUTTONS ARRAY;

    public void addFlipCardListener(ActionListener listenForFlipCard) {//CREATES AN ACTION LISTENER FOR WHEN YOU CLICK ON A BUTTON;
        for (int i = 0; i < 16; i++) {
            buttons[i].addActionListener(listenForFlipCard);//ADDS AN ACTION LISTENER TO ALL BUTTONS;
        }
    }

}