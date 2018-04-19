
package blackjack;

import java.util.ArrayList;

public class Player 
{
    private Deck deck;
    
    private ArrayList<Card> playersHand;
    
    public Player ()
    {
        deck = new Deck();
    }
   
    public Card drawPlayersCard()
    {
        Card drawnPlayersCard = deck.get(0);
        deck.remove(0);
    // draws card from deck    
        return drawnPlayersCard;
    }
    
    public void addCardToPlayersHand()
    {
        Card drawnPlayersCard = drawPlayersCard();
        playersHand.add(drawnPlayersCard);
    // adds drawn card to player's hand
        System.out.println("Player drew: " + drawnPlayersCard.getCardValue());
    }
    
    //add players bet
   // public static int handValue; 
    
    
}


