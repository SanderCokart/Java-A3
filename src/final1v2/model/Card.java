package final1v2.model;

import javax.swing.*;

public class Card {
   private int cardNumber;
   private JButton jButton;
   private boolean flipped = false;

    public Card(int cardNumber, JButton jButton){
        this.cardNumber = cardNumber;
        this.jButton = jButton;
    }

    public void unflip(){
        flipped = false;
    }

    public boolean isFlipped() {
        return flipped;
    }

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
