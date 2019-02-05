/*
 * Derek Schunicke
 * 991295326
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

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
        Card userCard = new Card();
        boolean matching = false;
        
        Scanner input = new Scanner(System.in);
        
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
        
        //asking user for card value and suit
        System.out.print("Please enter your card value (1-13): ");
        userCard.setValue(input.nextInt());
        System.out.println("Choose your suit (Hearts, Diamonds, Spades, Clubs)");
        userCard.setSuit(input.next());
        System.out.println(userCard.getValue() + " " + userCard.getSuit());
        
        //comparing users pick to magic hand
        for(int i = 0 ; i < magicHand.length; i++)
        {
        
            //if the user and card in magic hand match, make matching true
            if(userCard.getValue() == magicHand[i].getValue() && userCard.getSuit().equals(magicHand[i].getSuit()))
            {
            
                matching = true;
                
            }
        
        }

        //display if users guess was correct or not
        if(matching == true)
            System.out.println("You made a good guess!");
        else
            System.out.println("The card you picked is not in the magic hand.");
        
    }
    
}
