/*
 * Derek Schunicke
 * 991295326
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye & Derek
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        boolean matching = false;
        
        luckyCard.setValue(1);
        luckyCard.setSuit("Diamonds");
        
        //generating cards for magic hand and filling hand
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
            //use below line for testing to display generated cards
            //System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }
        
        //comparing users pick to magic hand
        for(int i = 0 ; i < magicHand.length; i++)
        {
        
            //if the user and card in magic hand match, make matching true
            if(luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit()))
            {
            
                matching = true;
                
            }
        
        }

        //display if the lucky card was in the hand
        if(matching == true)
            System.out.println("You made a good guess!");
        else
            System.out.println("The card you picked is not in the magic hand.");
        
    }
    
}
