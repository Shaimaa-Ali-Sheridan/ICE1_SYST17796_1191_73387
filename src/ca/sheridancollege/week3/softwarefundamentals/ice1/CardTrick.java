/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import javax.swing.JOptionPane;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author SangHeon, Park
 * @date February 5, 2019
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        boolean match = false;
        Card[] magicHand = new Card[7];
	Card luckyCard = new Card();
        
        for (int i = 0; i < magicHand.length; i++) {
	magicHand[i] = new Card();
	magicHand[i].setValue((int) (Math.random() * 13) + 1);
	magicHand[i].setSuit(Card.SUITS[(int) ((Math.random() * 3) + 1)]);
        }
        //insert code to ask the user for Card value and suit, create their card
	luckyCard.setValue(Integer.parseInt(JOptionPane.showInputDialog(null, "What is your card value? 0 - 13")));
	luckyCard.setSuit(JOptionPane.showInputDialog(null, "What is your suit? Diamonds | Spades | Hearts | Clubs"));
        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
	if ((luckyCard.getValue() == magicHand[i].getValue()) && (luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))) {
		match = true;
	} else
		match = false;
	}
        //Then report the result here
        if (match)
        System.out.println(luckyCard.getValue() + " " + luckyCard.getSuit());
        else
	System.out.println("Unlucky!");
        
        //Displaying randomly generated cards and the card user picked
        for (int i = 0; i < magicHand.length; i++) {
            System.out.println(i);
            System.out.println(magicHand[i].getValue());
            System.out.println(magicHand[i].getSuit());
        }
        System.out.println(luckyCard.getValue() + "\n" + luckyCard.getSuit());
    }    
}
