/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Andrew Rowe, 991531866
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) ((Math.random() * 3) + 1)]);
        }
            
            Card lucky = new Card();
            lucky.setValue(3);
            lucky.setSuit(Card.SUITS[2]);
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner k = new Scanner(System.in);
        System.out.print("Enter your Card value: ");
        int cardvalue = k.nextInt();
        
        System.out.print("Choose your Card Suit: 0 = Hearts, 1 = Diamonds, 2 = Spades, 3 = Clubs: ");
        int cardsuit = k.nextInt();
        
        Card c = new Card();
        c.setValue(cardvalue);
        c.setSuit(Card.SUITS[cardsuit]);
        
        for (int i=0; i<magicHand.length; i++){
             if(magicHand[i].getSuit().equals(lucky.getSuit()) && magicHand[i].getValue()==lucky.getValue()){
                System.out.println("You Won!");
        }else{
                System.out.println("You Lost!");
                }
        
        
        
    }
    
    }
}
