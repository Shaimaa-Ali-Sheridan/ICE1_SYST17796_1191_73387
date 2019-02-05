/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * 
 * @author Mohnish Gauni
 * ID: 991519320
 * 
 */
import java.util.*;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Spades");
        
        for (int i = 0; i< magicHand.length; i++)
        {
            Card c = new Card();
             //c.setValue(insert call to random number generator here)
            c.setValue((int)(1 + Math.random()* 13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(c.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;            
        }
               
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter a Card Value(1-13)");
        int userInput1 = input.nextInt();
        System.out.println("Enter a Suit(Hearts, Diamonds, Spades, Clubs");
        input.nextLine();
        String userInput2 = input.nextLine();
        
        Card userCard = new Card();
        userCard.setValue(userInput1);
        userCard.setSuit(userInput2);
        
         // and search magicHand here
         
        for(int i = 0; i < magicHand.length; i++){           
           /* if(userCard.getValue() == magicHand[i].getValue() && userCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit())){
                //Then report the result here
               System.out.println("Card Match");
            }*/ 
            if(luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit())){
                //Then report the result here
               System.out.println("Card Match");
            }
            
        }
        System.out.println("No Match");       
    }
    
}
