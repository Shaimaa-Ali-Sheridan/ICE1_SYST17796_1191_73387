/*
 * Name:-Harpreet Kaur
 * Student ID:-991514338
 * 
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * 
 *
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        
        Random r1=new Random();
        Card[] magicHand = new Card[7];
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(r1.nextInt(13)+1);
            //c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[(int)(Math.random()*3+1)]);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here]
        //insert code to ask the user for Card value and suit, create their card
          magicHand[i]=c;
          System.out.println("The random card suit is " + c.getSuit());
         System.out.println("The random number is" + c.getValue());
         break;
        }
        System.out.println("Enter a card number");
        String a=sc.nextLine();
         System.out.println("Enter a suit number");
        int b=sc.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(b);
        userCard.setSuit(a);
        for(int i=0;i<magicHand.length;i++){
        if(((magicHand[i].getSuit()).equals(userCard.getSuit()))&&(magicHand[i].getValue()==userCard.getValue())){
            System.out.println("You Win");
            break;
        }
        else{
            System.out.println("You Lost");
            break;
        } 
        }
        Card luckyCard=new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Heart");
        System.out.println("The lucky card is"+luckyCard.getValue());
        System.out.println("The lucky suit is"+luckySuit.getSuit());
    }
}

