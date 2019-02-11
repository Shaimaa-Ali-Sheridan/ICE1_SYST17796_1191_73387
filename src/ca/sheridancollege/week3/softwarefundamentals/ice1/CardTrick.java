/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier name: Parinkumar Patel  Student number : 991544657
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random r = new Random();
        int card;
        String suit ="";
        Scanner scan = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int value;
            String str;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c;
            c.setValue(r.nextInt((13 - 0) + 1) + 0);
            c.setSuit(Card.SUITS[r.nextInt(3)+0]);
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
        }
        
        boolean b = false;
        System.out.println("Pick Card: ");
        card = scan.nextInt();
        System.out.println("Suit: ");
        suit = scan.next();
        
        for (int i=0; i<magicHand.length; i++)
        {
            int a = magicHand[i].getValue();
            String s = magicHand[i].getSuit();
            if(card == a && suit.equals(s))
            {
                    b = true ;
            }
        }
        
            if (b == true)
                System.out.println("Congratulations..!!Lucky Card Matches to your Card.");
            else
                System.out.println("Your Card Does Not Match.! Try Next Time.");
        
    }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        
    }
    

