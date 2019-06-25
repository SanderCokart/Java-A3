package final1.model;

import java.util.Random;

public class GameField {

    private int[] cardDeck;//AN ARRAY THAT HOLDS THE CARDS OF THE GAME;
    private Card[] card_object_array;//AN ARRAY THAT STORES THE CARD OBJECTS;

    private static void shuffle(int[] array) {//method that shuffles the cardDeck;
        int n = array.length;
        Random random = new Random();
        // Loop over array.
        for (int i = 0; i < array.length; i++) {
            // Get a random index of the array past the current index.
            // ... The argument is an exclusive bound.
            //     It will not go past the array's end.
            int randomValue = i + random.nextInt(n - i);
            // Swap the random element with the present element.
            int randomElement = array[randomValue];
            array[randomValue] = array[i];
            array[i] = randomElement;
        }
    }

    public void setCard_object_array(Card[] card_object_array) {
        this.card_object_array = card_object_array;
    }//METHOD TO SET THE card_object_array to the array that gets entered as a parameter;

    public void setCardDeck(int[] cardDeck) {
        shuffle(cardDeck);//shuffles the deck
        this.cardDeck = cardDeck;//sets the cardDeck;
    }
}
