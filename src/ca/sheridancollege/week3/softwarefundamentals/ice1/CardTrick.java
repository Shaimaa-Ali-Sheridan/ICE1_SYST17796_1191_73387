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
 * @author dancye
 *//*Monnika Sampson 991499219*/
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(4);
        Random num = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValuea = c.setValue((int)Math.random()*(2 +1));
            c.setValue(1+ num.nextInt(13));
           // c.setValue(Card.values[1+ num.nextInt(4)]);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[1 + num.nextInt(3)]);
           c = magicHand[i];
        }
        
        //insert code to ask the user for Card value and suit, create their card
       
            System.out.println("Please pick your card value " + Card.values +  "and suit " + Card.SUITS);
            String guessCard= input.nextLine();
            
        // and search magicHand here
        boolean result = true;
        while(result){
            for(int j =0; j < magicHand.length; j++){
                if(luckyCard.equals(magicHand[j])){
                  break; 
                } 
            }
            if(result == false){
                System.out.println("You are a winner");
                break;
            }
            else{
                System.out.println("You lost the game");
             
            }
        }
         
        
        //Then report the result here
    }
    
}
