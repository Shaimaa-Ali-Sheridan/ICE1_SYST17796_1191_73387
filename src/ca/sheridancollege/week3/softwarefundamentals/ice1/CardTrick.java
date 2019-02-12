/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier name: Shivani Patel Student Number: 991528174
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card(); // From git
         int card;
        String suit ="";
        Scanner objInput = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int val;
            String su;
            c.setValue(rand.nextInt((13 - 0) + 1) + 0);
            c.setSuit(Card.SUITS[rand.nextInt(3) + 0]);
            magicHand[i]=c;
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
        }
        boolean check = false;
         System.out.println("Pick Card: ");
        card = objInput.nextInt();
        int CardVal = luckyCard.getValue(); 
        System.out.println("Suit: ");
        suit = objInput.next();
        String SuitStr  = luckyCard.getSuit();
         for (int i=0; i<magicHand.length; i++)
        {
           int mv= magicHand[i].getValue();
           String mS=magicHand[i].getSuit();
           if(card ==  mv && suit.equals(mS))
            {
                check = true;

            }      
        }
         if(check == true)
                System.out.println("Your card match to the lucky card");
           else
                System.out.println("No card match");
        
    }
}

