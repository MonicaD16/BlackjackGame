package blackjack;

public class Card
{
  private Suit suit;
  private CardValue cardValue;
 
  public Card (CardValue cardValue, Suit suit)
  {
    this.cardValue = cardValue;
    this.suit = suit;
  }

  public Suit getSuit()
  {
    return suit;
  }
 
  public CardValue getCardValue()
  {
    return cardValue;
  }
 
  public void setCardValue(CardValue cardValue)
  {
    this.cardValue = cardValue;
  }

        //if (drawnCard.getSuit() == Suit.CLUBS) {
        //if you want to use the suit    
            
  
}