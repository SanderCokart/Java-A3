package final1.model;

import javax.swing.*;

public class Card {
    private int cardNumber;//the cardNumber assigned to this card;
    private JButton jButton;//the jButton that is assigned to this card;
    private Boolean turnable = true;//defines whether or not the card is turnable;

    public Card(int cardNumber, JButton jButton) {//upon creation;
        this.cardNumber = cardNumber;//set the card number of this card;
        this.jButton = jButton;//set the JButton of this card;
//        System.out.println(cardNumber);//SOUT the card numbers;
    }


    public void flipCard() {//method to flip a card;
        if (jButton.getIcon() == null) {//if the icon compares to null;
            switch (cardNumber) {//set the image of corresponding to the cardNumber
                case 1:
                    jButton.setIcon(new ImageIcon("C:\\Users\\cokar\\OneDrive - ROC Drenthe College\\Drenthe College Van Schaikweg\\IT\\Java A3\\src\\final1\\resources\\card_1.jpg"));
                    break;
                case 2:
                    jButton.setIcon(new ImageIcon("C:\\Users\\cokar\\OneDrive - ROC Drenthe College\\Drenthe College Van Schaikweg\\IT\\Java A3\\src\\final1\\resources\\card_2.jpg"));
                    break;
                case 3:
                    jButton.setIcon(new ImageIcon("C:\\Users\\cokar\\OneDrive - ROC Drenthe College\\Drenthe College Van Schaikweg\\IT\\Java A3\\src\\final1\\resources\\card_3.jpg"));
                    break;
                case 4:
                    jButton.setIcon(new ImageIcon("C:\\Users\\cokar\\OneDrive - ROC Drenthe College\\Drenthe College Van Schaikweg\\IT\\Java A3\\src\\final1\\resources\\card_4.jpg"));
                    break;
                case 5:
                    jButton.setIcon(new ImageIcon("C:\\Users\\cokar\\OneDrive - ROC Drenthe College\\Drenthe College Van Schaikweg\\IT\\Java A3\\src\\final1\\resources\\card_5.jpg"));
                    break;
                case 6:
                    jButton.setIcon(new ImageIcon("C:\\Users\\cokar\\OneDrive - ROC Drenthe College\\Drenthe College Van Schaikweg\\IT\\Java A3\\src\\final1\\resources\\card_6.jpg"));
                    break;
                case 7:
                    jButton.setIcon(new ImageIcon("C:\\Users\\cokar\\OneDrive - ROC Drenthe College\\Drenthe College Van Schaikweg\\IT\\Java A3\\src\\final1\\resources\\card_7.jpg"));
                    break;
                case 8:
                    jButton.setIcon(new ImageIcon("C:\\Users\\cokar\\OneDrive - ROC Drenthe College\\Drenthe College Van Schaikweg\\IT\\Java A3\\src\\final1\\resources\\card_8.jpg"));
                    break;
            }
        } else {//if the JButton icon does not compare to null;
            jButton.setIcon(null);//set the text to null;
        }


    }

    //getter and setters for turnable value
    public void setTurnable(Boolean turnable) {
        this.turnable = turnable;
    }

    public Boolean getTurnable() {
        return turnable;
    }

    public int getCardNumber() {//returns the cardNumber of this card;
        return cardNumber;
    }
}
