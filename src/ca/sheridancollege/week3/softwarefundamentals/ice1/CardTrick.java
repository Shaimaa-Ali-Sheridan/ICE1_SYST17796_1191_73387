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
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card userCard;
        Scanner input = new Scanner(System.in);
        int userCardNumber, userCardSuit;
        
        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue((int) (Math.random() * 12 + 1));
            magicHand[i].setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        System.out.println("Please choose a card number 1-13: ");
        userCardNumber = input.nextInt();
        System.out.print("Input a number for a card suit, 1. Hearts 2. Diamonds 3. Spades 4. Clubs :");
        userCardSuit = input.nextInt() - 1;
        
        userCard = new Card(userCardNumber, Card.SUITS[userCardSuit]);
        
        boolean isCardOnMagicHand = false;
        for(Card card : magicHand)
            if(card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit()))
                isCardOnMagicHand = true;
        
        if(isCardOnMagicHand)
            System.out.println("Your card is in the magic hand!");
        else
            System.out.println("Your card is not in the magic hand");
    }
    
}
