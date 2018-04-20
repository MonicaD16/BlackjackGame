package blackjack;

import java.util.ArrayList;

public class Dealer
{
    private Deck deck;
    
    private ArrayList<Card> hand;
    
    public Dealer ()
    {
        deck = new Deck();
    }
    
    //Draws a card from the deck.

    public Card drawCard()
    {
        //Calls the Deck get(int index) function, because
        //deck in this class is a Deck
        Card drawnCard = deck.get(0);
        //Calls the Deck remove(int index) function, because
        //deck in this class is a Deck
        deck.remove(0);
        return drawnCard;
    }
 
    public void addCardToHand()
    {
        Card drawnCard = drawCard();
        hand.add(drawnCard);
        System.out.println("Dealer drew: " + drawnCard.getCardValue());
    }
}
