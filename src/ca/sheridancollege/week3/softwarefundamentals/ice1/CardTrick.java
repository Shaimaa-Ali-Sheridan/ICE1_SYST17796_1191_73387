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
 * @author Savankuamr Chaudhari
 * STUDENT ID 991518360
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        boolean res = false;
        Card[] magicHand = new Card[7];
        Random rm = new Random();
        Scanner in = new Scanner(System.in);
        
        int cardnum;
        String cardtype;
        
        Card LuckyCard = new Card();
        LuckyCard.setValue(7);
        LuckyCard.setSuit(Card.SUITS[1]);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rm.nextInt(13)+ 1 );
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rm.nextInt(3)]);
            magicHand[i] =c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("select card number which 1 you want to search : ");
        cardnum = in.nextInt();
        
        System.out.println("Select card type which 1 you want to search : ");
        cardtype = in.next();
        
        for (Card magicHand1 : magicHand) {
            res = (magicHand1.getValue() == cardnum) && (magicHand1.getSuit().equals(cardtype));
        }
        if(res == true)
        {
             System.out.println("MATCH THE LUCKY CHOICE");
        }
        else
        {
            System.out.println("SORRY...BETTER LUCK NEXT TIME");
        }
                
      
        
        // and search magicHand here
       
        
        //Then report the result here
        
        
    }
    
}
