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
 * @modifier Gurpartap Gill 991529145
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int num;
        String type;
        boolean result = false;
        
        //adding luckyCard
        Card luckyCard = new Card();
        luckyCard.setValue(13);
        luckyCard.setSuit(Card.SUITS[0]);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(random.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[random.nextInt(3)]);
            //adding values
            magicHand[i] = c;
        }
       
        //insert code to ask the user for Card value and suit, create their card
        
        System.out.println("Choose your card number");
        num = input.nextInt();
        System.out.println("Choose your suit");
        type = input.next();

        // and search magicHand here
        
        for(int i=0; i<magicHand.length; i++)
       {
           if(magicHand[i].getValue() == num && magicHand[i].getSuit() == type)
           {
               result = true;
               break;
           }
           else
           {
               result = false;
           }
       }

        //Then report the result here
       
        if(result == true)
       {
           System.out.println("You win");
       }
       else
       {
           System.out.println("You loose");
       }

    }
    
}
