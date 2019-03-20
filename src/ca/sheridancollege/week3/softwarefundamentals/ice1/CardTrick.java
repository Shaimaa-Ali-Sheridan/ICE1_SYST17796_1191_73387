/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * Modifier : Pragnesh Patil
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
       
        Card[] objMagicHand = new Card[7];
        Card objMuckyCard = new Card();
       
        boolean valid = false;
        Scanner inputObj = new Scanner(System.in);
        Random num = new Random();
        for (int i=0; i<objMagicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(num.nextInt(13) + 1);
            c.setSuit(Card.SUITS[num.nextInt(3) + 0]);
            objMagicHand[i]=c;
           
        }
        int luckyCardVal = 3;
        String luckyCardSuits = "Hearts";
        System.out.println("Enter number between 1 to 13 for cards: "); 
        int userNum = inputObj.nextInt();
        System.out.println("Enter Suit (Hearts, Diamonds, Spades, Clubs): ");
        String userCard = inputObj.next();
        
        for (int i=0; i<objMagicHand.length; i++)
        {
           int getNum = objMagicHand[i].getValue();
           String getSuit =objMagicHand[i].getSuit();
           if(userNum ==  getNum && userCard.equals(getSuit))
            {
                valid = true;

            }    
        }
        //Check the condition for the card
        if(valid == true)
        {
                System.out.println("Card Matched with Lucky card");
        }
           else
        {
                System.out.println("Card did not matched with your Lucky card");
        }
        
    }
    
}
