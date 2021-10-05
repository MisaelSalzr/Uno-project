package Deck;

import java.util.*;
import static Deck.Colors.*;

/*
 * @author Misael Salazar
 */
public class Deck {
    //The Deck stores a collection of cards, this allows us to use
    // the collections shuffle method, and the base deck size for
    // an uno set is 112 cards
    private static ArrayList<Card> deckOfCards;
    private static final int deckSize = 112;
    private static final int numSpecCards = 8;
    private static final int numColorCards = 104;
    
    //This is our Deck constructor
    public Deck(){
        
        deckOfCards = new ArrayList<>(deckSize);
        
        //Iterate through every color, to assign the color and value to a card
        for(Colors c: Colors.values()){
            
            //We assign the 4 colors to 104 cards (26 cards each)
            //and reserve 8 cards to be special (Wildcards)
            if(c != SPECIAL){
                for(int i = 0; i < (numColorCards / 4); i++){
                    // Every Card is constructed with (i % 13) to ensure 
                    // every Color has two of each value (0 - 9 and 3 effects)
                    Card Card = new Card(i % 13, c);
                    deckOfCards.add(Card);
                }
            }else{
                for(int i = 0; i <= numSpecCards; i++){
                    // Every Card is constructed with (i % 2) to ensure
                    // there are four Wildcards and four Wildcard +4s
                    Card Card = new Card((i % 2), c);
                    deckOfCards.add(Card);
                    
                }
                
            }
            
        }
        
    }
    
    // Easy implementation of the deck shuffle
    public void shuffle(){
        
        Collections.shuffle(deckOfCards);
        
    }

    /**
     * @return the deckOfCards
     */
    public ArrayList<Card> getDeckOfCards() {
        
        return deckOfCards;
        
    }
    
    
    
}