/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author Gagandeep Ghotra
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        int max = 13;
        int min = 1;
        
        int max1 = 3;
        int min2 = 0;
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)((Math.random() * ((max - min) + 1)) + min)); //insert call to random number generator here
            c.setSuit(Card.SUITS[(int)((Math.random() * ((max1 - min2) + 1)) + min2)]);
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuit("Spades");

        for(int i = 0; i < magicHand.length; i++)
        { 
            System.out.print(magicHand[i].toString());
            
            if(magicHand[i].isEquals(luckyCard))
                System.out.println(", equal to card with value 6 and suit diamonds? " + ", the cards are equal!");
            
            else 
                System.out.println(", equal to card with value 6 and suit diamonds? " + ", the cards are not equal!");
        }

    }
    
}
