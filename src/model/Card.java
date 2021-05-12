
package model;

//Card class
public class Card {
    
    private int cardId;
    private String cardNumber;
    private int cardCredit;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardCredit() {
        return cardCredit;
    }

    public void setCardCredit(int cardCredit) {
        this.cardCredit = cardCredit;
    }

    @Override
    public String toString() {
        return "Card{" + "cardId=" + cardId + ", cardNumber=" + cardNumber + ", cardCredit=" + cardCredit + '}';
    }
    
}
