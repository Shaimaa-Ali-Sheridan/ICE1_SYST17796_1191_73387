
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
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
        Card[] magicHand = new Card[7];
        Card card = new Card();
        card.setValue(4);
        card.setSuit("Diamonds");
        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(1 + rand.nextInt(13));
            c.setSuit(Card.SUITS[1+ rand.nextInt(3)]);
           magicHand[i] = c;
        }
        
         //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result hereF
        
        boolean test = true;
        for(int i = 0; i < magicHand.length; i++){
        if (card.equals(magicHand[i])){
            test = false;
        }
        }
        String status;
        status = (test == false) ? "You win!" : "You lose, haha!";
        System.out.println(status);
        
       
        
        
        
        
        
    }
    
}

