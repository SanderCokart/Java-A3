package final1.controller;

import final1.model.Card;
import final1.model.GameField;
import final1.view.GameView;
import final1.view.WinView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class GameController {
    private GameField game_field_object;//local access to the GameField;
    private GameView game_view_object;//local access to the GameView;
    private WinView win_view_object;//local access to the WinView;
    private JButton[] buttons_array;//local access to the Jbutton array;
    private int[] cardDeck = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8};//sets the numbers for the card deck;
    private Card[] card_object_array = new Card[cardDeck.length];//Card object array that is the size of the cardDeck;

    public GameController(GameView game_view_object, GameField game_field_object, WinView win_view) {//upon creation of the GameController;
        //assigns all parameters to local objects;
        this.game_view_object = game_view_object;
        this.game_field_object = game_field_object;
        this.win_view_object = win_view;

        //puts all buttons into a buttons array;
        this.buttons_array = game_view_object.getButtons();

        //sets up the Action Event listeners;
        this.game_view_object.addFlipCardListener(new AddFlipCardListener());
        this.win_view_object.addExitButtonListener(new AddExitButtonListener());

        //sets the cardDeck;
        game_field_object.setCardDeck(cardDeck);

        //Generates 16 card objects;
        for (int i = 0; i < 16; i++) {
            Card card = new Card(cardDeck[i], buttons_array[i]);
            this.card_object_array[i] = card; //puts the cards into an array for easy access;
        }

        this.game_field_object.setCard_object_array(card_object_array);//sets the card array as the array in the game_field;
    }

    private class AddFlipCardListener implements ActionListener {//when the users clicks on a card;
        private int storedNumber = 0;//initializes the storedNumber;
        private int storedIndex;//initializes the storedIndex
        private int matches = 0;//initializes the amount matches;

        @Override
        public void actionPerformed(ActionEvent e) {//on click;
            Timer timer = new Timer();//create a timer;
            for (int x = 0; x < buttons_array.length; x++) {

                if (e.getSource() == buttons_array[x] && card_object_array[x].getTurnable() == true && card_object_array[x].getCardNumber() != storedNumber) {//if the source of the action event compares to one of the buttons_array locations;
                    if (storedNumber == 0) {//if storedNumber is not set;
                        storedNumber = card_object_array[x].getCardNumber();//storedNumber becomes that cards card number;
                        storedIndex = x;//stores the index for later use;
                        card_object_array[x].flipCard();//flips the card at the index of x;
                    } else if (storedNumber != card_object_array[x].getCardNumber()) {//if storedNumber does not equal to get current card number;
                        card_object_array[x].flipCard();//flip the card;

                        for (int i = 0; i < buttons_array.length; i++) {//sets all buttons to disabled;
                            buttons_array[i].setEnabled(false);
                        }

                        int finalX = x;//final X variable for use in Timer;
                        timer.schedule(new TimerTask() {
                            @Override
                            public void run() {//timer function
                                card_object_array[storedIndex].flipCard();//flip the previous card back over;
                                card_object_array[finalX].flipCard();//flip the current card back over;
                                storedNumber = 0;//set the stored number to 0;
                                storedIndex = 0;//set the stored index to 0;
                                for (int i = 0; i < buttons_array.length; i++) {
                                    buttons_array[i].setEnabled(true);//sets all buttons back to enabled;
                                }
                            }
                        }, 1000);
                    } else {
                        card_object_array[x].setTurnable(false);//sets the clicked cards turnable value to false;
                        card_object_array[storedIndex].setTurnable(false);//sets previous clicked card turnable value to false;
                        storedIndex = 0;//set the storedIndex to 0;
                        storedNumber = 0;//set the storedNumber to 0;
                        matches++;//increments the matches variable;
                        card_object_array[x].flipCard();//flips the current card that is clicked;
                    }
                }
            }
            if (matches == 8) {
                win_view_object.setVisible(true);//show Win view;
            }
        }
    }

    private class AddExitButtonListener implements ActionListener {//action listener for the exitButton;

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);//shuts down application;
        }
    }
}