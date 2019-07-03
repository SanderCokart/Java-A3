package final1v2.view;

import javax.swing.*;
import java.awt.*;

public class GameView {
    private JFrame f;
    private JButton[] buttonArray;

    public GameView() {
        f = new JFrame("Memory");
        f.setSize(800,800);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setVisible(true);
        f.setLayout(new GridLayout(4,4));

        //functions
        createButtons();
        f.revalidate();
        f.repaint();

    }

    private void createButtons() {
        buttonArray = new JButton[16];
        for(int i = 0; i < 16; i++) {
            JButton button = new JButton();
            button.setBackground(Color.white);
            button.setFont(new Font("Monospace", Font.PLAIN, 30));
            button.setFocusable(false);
            buttonArray[i] = button;
            f.add(button);
        }
    }

    public JButton[] getButtonArray() {
        return buttonArray;
    }
}
