/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rn = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rn.nextInt(13)+1);
            c.setSuit(Card.SUITS[rn.nextInt(3)]);
            // adding values
            magicHand[i]=c;
        }
        
        for (int i=0; i<magicHand.length; i++)
        {
            System.out.println(magicHand[i].getValue()+" "+magicHand[i].getSuit());
            
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Card NUmber: ");
        int cardx = input.nextInt();
        System.out.println("Choose Suite NUmber: ");
        int suitex = input.nextInt();
        
        for (int i=0; i<magicHand.length; i++)
        {
            /*if(cardx == magicHand[i].getValue() && suitex == magicHand[i].getSuit()){
                System.out.println("WON");
            }
            else
                System.out.println("LOSE");*/
            
            
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
