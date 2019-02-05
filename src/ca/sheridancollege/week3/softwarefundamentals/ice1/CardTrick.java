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
        int userValue = 0;
        String userSuit = "";
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++) {
	magicHand[i] = new Card();
	magicHand[i].setValue((int) (Math.random() * 13) + 1);
	magicHand[i].setSuit(Card.SUITS[(int) ((Math.random() * 3) + 1)]);
        }
        //insert code to ask the user for Card value and suit, create their card
        userValue = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your card value?"));
        userSuit = JOptionPane.showInputDialog(null, "What is your suit?");
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
            if (userValue == magicHand[i].getValue() && userSuit.equals(magicHand[i].getSuit()))
            System.out.println("You guessed the magic card!\nMagicCard: "+magicHand[i].getValue()+" of "+magicHand[i].getSuit());
            break;
        }
        //Then report the result here
    }    
}
