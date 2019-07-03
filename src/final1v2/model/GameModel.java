package final1v2.model;

import javax.swing.*;
import java.util.Random;

public class GameModel {
    private int[] cardNumbers = new int[] {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
    private Card[] cardArray = new Card[16];

    public GameModel(JButton[] buttonArray) {
        shuffle(cardNumbers);
        for (int i = 0; i < 16; i++) {
            Card card = new Card(cardNumbers[i], buttonArray[i]);
            cardArray[i] = card;
        }
    }

    private static void shuffle(int[] array) {//method that shuffles the cardDeck;
        int n = array.length;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomValue = i + random.nextInt(n - i);
            int randomElement = array[randomValue];
            array[randomValue] = array[i];
            array[i] = randomElement;
        }
    }

    public Card[] getCardArray() {
        return cardArray;
    }
}


