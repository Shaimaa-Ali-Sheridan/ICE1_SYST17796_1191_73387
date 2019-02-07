/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import  java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        int value;
        int num1;
        Random number=new Random();
        int Num1;
        Card[] magicHand = new Card[7];
      
        Scanner input=new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
         
            
          
            c.setValue(number.nextInt(13)+1);
             //c.setValue(insert call to random number generator here)
        
            Num1=(number.nextInt(3));
            c.setSuit(Card.SUITS[Num1]);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i]=c;
          
            
        }
        System.out.println("enter a card number which u like");
        value=input.nextInt();
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter a suite value");
        num1=input.nextInt();
       Card Luky Card=new Card();
        Lucky Card.setSuit(2);
        Lucky Card.setValue(10);
       
        
        
                   
       // and search magicHand here\
       
        //Then report the result here
    

     
}
}


