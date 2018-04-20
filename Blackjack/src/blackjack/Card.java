package blackjack;

public class Card
{

    /**
     *
     */
    public static int[] cardsInPlay = {0};
  
  private Suit suit;
  private CardValue cardValue;
 
  public Card ()
  {
        
    int num = 0;
              
    boolean notInUse = false;
    while (notInUse == false){
        num = 1 + (int)(Math.random() * 51);
        for (int i = 0; i<= cardsInPlay.length;i++ ){
            if (cardsInPlay[i] == num){
                notInUse = false;
                break;
            } else {
                notInUse = true;
            }
        }
    }
    cardsInPlay[cardsInPlay.length + 1] = num;
    
    if (num <=13){
        suit = HEARTS;
    }
    
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
}

