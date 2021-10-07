package uno;

import java.util.Scanner;

/*
 * @author Misael Salazar
 */
public class Uno {
    
    //The Uno class is going to be the main body of the game
    //public static Deck deck = new Deck();
    //public static Player playerOne = new Player();
    static int playerCount;
    
    Scanner in;
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of players: ");
        playerCount = in.nextInt();
        
        UnoGame uno = new UnoGame(playerCount);
        
        //deck.shuffle();
        //playerOne.initHand(deck);
        
        /*System.out.println("The players hand:");
        for(Card c : playerOne.getHand()){
            
            System.out.println(c.getCardValue() + " and " + c.getCardColor());
            
        }
        
        System.out.println("The rest of the deck:");
        for(Card c : deck.getDeckOfCards()){
        
            System.out.println(c.getCardValue() + " and " + c.getCardColor());
        }*/
        
    }
    
}
