/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Zain Razvi 
 * @Student# 991517290
 * @date: February 10, 2019
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        boolean d = false; //This variable is used return true or false if the values match
        Card luckyCard = new Card()
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            magicHand[i].setValue((int)(Math.random() * 13 + 1));
            magicHand[i].setSuit(Card.SUITS[(int)(Math.random() * 4)]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("What is your card value?");
        int card = input.nextInt();
        System.out.println("What is your suit?");
        String suit = input.nextLine();
        luckyCard.setValue(card);
        luckyCard.setSuit(suit);
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++)
        {
            if(luckyCardgetValue == magicHand[i].getValue() && luckyCardgetSuit.equals(magicHand[i].getSuit()))
            {
                d = true;
                //System.out.println("The card values and suit are in the magic hand");
            }
            else
            {
                d = false;
                //System.out.println("The card values and suit are not in the magic hand");
            }
        }
        System.out.println(d); 
        
        //Then report the result here
        if(d == true)
        {
            System.out.println("Your card value " + luckyCard.getValue() + " and suit " + luckyCard.getSuit() + "are in the magic hand");
        }
        else
        {
            System.out.println("Your card values and suit are not in the magic hand");
        }
    }
    
}
