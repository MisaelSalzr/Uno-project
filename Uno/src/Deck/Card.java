package Deck;

/*
 * @author Misael Salazar
 */

// The Card class stores the value and color of a given card
public class Card {

    private int cardValue;
    private Colors cardColor;
    
    // This is the Card constructor
    Card(int cardValue, Colors cardColor){
    
        this.cardValue = cardValue;
        this.cardColor = cardColor;
        
    }
    //Getter for card value
    public int getCardValue() {
        
        return cardValue;
        
    }
    //Getter for card color
    public Colors getCardColor() {
        
        return cardColor;
        
    }
    
}
