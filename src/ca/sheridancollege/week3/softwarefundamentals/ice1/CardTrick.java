package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
@author dancye
@modifier Sudikshya Bisoyi
@StudentID 991451770
 */
 
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++) {
            Card c = new Card();
            Random rand = new Random();
            int randomNum = rand.nextInt((10 - 2) + 1) + 2;
            int randomNum1 = rand.nextInt((3 - 0) + 1) ;
            c.setValue(randomNum);
            c.setSuit(Card.SUITS[randomNum1]);
            magicHand[i] = c;
        }
     
        Card Lucky = new Card();
        Lucky.setValue(5);
        Lucky.setSuit(Card.SUITS[1]);

        
        Scanner Input = new Scanner(System.in);
        System.out.print("Please chose the Card Suit : 0 = Hearts, 1 = Diamonds, 2 = Spades , 3 = Clubs : ");
        
        int suitnumber = Input.nextInt();
        //output:
        System.out.print("Please Enter a card number here : ");
        
        int cardnumber = Input.nextInt();
        
         Card c = new Card();
          c.setValue(cardnumber);
          c.setSuit(Card.SUITS[suitnumber]);
          
      
        boolean flag = true;  
        for (int i=0; i<magicHand.length; i++)
        {
            
            if(magicHand[i].getSuit().equals(Lucky.getSuit()) && magicHand[i].getValue() == Lucky.getValue()){
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
    
