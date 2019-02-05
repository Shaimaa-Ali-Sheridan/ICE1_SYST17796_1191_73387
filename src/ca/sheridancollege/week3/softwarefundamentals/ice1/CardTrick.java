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
 * @author Lucas Zanlorensi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        LuckyCard luckyCard;
        
        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue((int) (Math.random() * 12 + 1));
            magicHand[i].setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }
        
        //Creating lucky card
        luckyCard = new LuckyCard();
        
        boolean isLuckyCardOnMagicHand = false;
        for(Card card : magicHand)
            if(card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit()))
                isLuckyCardOnMagicHand = true;
        
        if(isLuckyCardOnMagicHand)
            System.out.println("The lucky card is in the magic hand!");
        else
            System.out.println("The Lucky card is not in the magic hand");
    }
    
}
