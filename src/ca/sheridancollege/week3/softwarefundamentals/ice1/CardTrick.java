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
 * @modifier Wahaj latif, 5 / 2 / 2019
 * @StudentID 991531064
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random rand = new Random();
            int randomNum = rand.nextInt((10 - 2) + 1) + 2;
            int randomNum1 = rand.nextInt((3 - 0) + 1) ;
            c.setValue(randomNum);
            c.setSuit(Card.SUITS[randomNum1]);
            magicHand[i] = c;
        }
        
        Card LuckyCard = new Card();
        LuckyCard.setValue(5);
        LuckyCard.setSuit(Card.SUITS[1]);

        
        Scanner Input = new Scanner(System.in);
        System.out.print("Please chose the Card Suit : 0 = Hearts, 1 = Diamonds, 2 = Spades , 3 = Clubs : ");
        
        int suitnumber = Input.nextInt();
        
        System.out.print("Please Enter the card number : ");
        int cardnumber = Input.nextInt();
        
         Card c = new Card();
          c.setValue(cardnumber);
          c.setSuit(Card.SUITS[suitnumber]);
          
      
        boolean flag = true;  
        for (int i=0; i<magicHand.length; i++)
        {
            
            if(magicHand[i].getSuit().equals(LuckyCard.getSuit()) && magicHand[i].getValue() == LuckyCard.getValue()){
                System.out.println("FOUND YOU WON !!! ");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("NOT FOUND YOU LOSE !!! ");
        }
       
    }
    
}
