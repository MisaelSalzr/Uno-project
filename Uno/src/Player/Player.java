package Player;

import Deck.Card;
import Deck.Deck;
import java.util.*;

/*
 * @author Misael Salazar
 */
public class Player {
    
    private ArrayList<Card> hand;
    private int handSize = 0;
    private static final int startSize = 7;
    
    
    public Player(){
    
        hand = new ArrayList<>();
        
    }
    
    public void initHand(Deck deck){
        
        for(int i = 0; i < startSize; i++){
            
            drawCard(deck);
            handSize = startSize;
            
        }

    }
    

    /**
     * @return the Hand
     */
    public ArrayList<Card> getHand() {
        
        return hand;
        
    }
    
    private void drawCard(Deck deck){
        
        hand.add(deck.getDeckOfCards().get(0));
        deck.getDeckOfCards().remove(0);
        handSize++;
        
    }

    /**
     * @return the HandSize
     */
    public int gethandSize() {
        
        return handSize;
        
    }
    
}