package final1v2.controller;

import final1v2.model.Card;
import final1v2.model.GameModel;
import final1v2.view.GameView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.Timer;

public class Controller {
    private GameModel gameModel;
    private GameView gameView;
    private JButton[] buttonsArray;
    private JButton previousButton;
    private Card[] cardArray;
    private Card previousCard;
    private int matches = 0;
    private boolean wait = false;

    //construct
    public Controller() {
        this.gameView = new GameView();
        this.buttonsArray = gameView.getButtonArray();
        this.gameModel = new GameModel(buttonsArray);
        this.cardArray = gameModel.getCardArray();

        //methods / functions
        setupActionListener();
    }

    private void setupActionListener() {
        for (int i = 0; i < 16; i++) {
            int j = i;
            gameView.getButtonArray()[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!cardArray[j].isFlipped() && previousCard == null && previousButton == null && !wait){//first click
                        cardArray[j].setFlipped(true);
                        String cardNumber = Integer.toString(cardArray[j].getCardNumber());
                        buttonsArray[j].setText(cardNumber);
                        buttonsArray[j].setBackground(Color.orange);
                        previousButton = buttonsArray[j];
                        previousCard = cardArray[j];
                    } else if (!cardArray[j].isFlipped() && previousCard != null && previousButton != null && !wait) {//second click
                        cardArray[j].setFlipped(true);
                        String cardNumber = Integer.toString(cardArray[j].getCardNumber());
                        buttonsArray[j].setText(cardNumber);
                        if (cardArray[j].getCardNumber() == previousCard.getCardNumber()) {//if it matches
                            buttonsArray[j].setBackground(Color.green);
                            previousButton.setBackground(Color.green);
                            previousButton = null;
                            previousCard = null;
                            matches++;
                        } else {//if it does not match
                            buttonsArray[j].setBackground(Color.orange);
                            previousButton.setBackground(Color.orange);
                            wait = true;
                            TimerTask task = new TimerTask() {
                                @Override
                                public void run() {
                                    buttonsArray[j].setBackground(Color.white);
                                    previousButton.setBackground(Color.white);
                                    cardArray[j].setFlipped(false);
                                    previousCard.setFlipped(false);
                                    buttonsArray[j].setText("");
                                    previousButton.setText("");
                                    previousCard = null;
                                    previousButton = null;
                                    wait = false;
                                }
                            };
                            Timer timer = new Timer();
                            timer.schedule(task, 1000);
                        }
                    }
                }
            });
        }
    }
}
