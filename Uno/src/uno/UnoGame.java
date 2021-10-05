package uno;

import Deck.Card;
import Deck.Deck;
import Player.Player;
import java.util.*;

/**
 *
 * @author mslsa
 */
public class UnoGame {
    
    private Deck gameDeck;
    private Player [] players;
    private Stack<Card> playedPile = new Stack<>();
    private Scanner in = new Scanner(System.in);
    char [] gameState;
    
    UnoGame(int playerCount){
        
        players = new Player[playerCount];
        gameDeck = new Deck();
        
        for(int i = 0; i < playerCount; i++){
        
            players[i].initHand(gameDeck);
            
        }
        
        System.out.print("Choose: Q to quit, R to reset, or P to play! ");
        gameState = in.next().toCharArray();
        
        
    }
    
    void ResetGame(){
        
        gameDeck = new Deck();
        
    }
    
}
