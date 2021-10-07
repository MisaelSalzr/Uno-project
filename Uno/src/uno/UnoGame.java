package uno;

import Deck.Card;
import static Deck.Colors.SPECIAL;
import Deck.Deck;
import Player.Player;
import java.util.*;

/**
 *
 * @author mslsa
 */
public class UnoGame {
    
    private static Deck gameDeck;
    private static Player [] players;
    private static Stack<Card> playedPile = new Stack<>();
    
    int playersTurn;
    private Scanner in = new Scanner(System.in);
    char gameState;
    
    UnoGame(int playerCount){
        
        players = new Player[playerCount];
        gameDeck = new Deck();
        
        for(int i = 0; i < playerCount; i++){
        
            players[i] = new Player();
            players[i].initHand(gameDeck);
            
        }
        
        System.out.print("Choose: Q to quit, R to reset, or P to play! ");
        gameState = in.next().charAt(0);
        
        switch(gameState){
        
            case 'Q':
                break;
                
            case 'R':
                ResetGame();
                break;
            
            case 'P':
                break;
                
            default:
                System.out.println("Input unknown, terminating program");
                return;
            
        }
        
        
    }
    
    static void ResetGame(){
        
        gameDeck = new Deck();
        
    }
    
    static void playGame(){
    
        
    }
    
    static boolean isUno(int playerTurn){
        return (players[playerTurn].gethandSize() == 0);
    }
    
    static boolean isValidCard(Card playedCard){
    
        if(playedCard.getCardColor() == SPECIAL)
            return true;
        
        if((playedPile.peek().getCardColor() == playedCard.getCardColor()))
            return true;
        
        if(playedPile.peek().getCardValue() == playedCard.getCardValue())
            return true;
        
        return false;
        
    }
    
}
