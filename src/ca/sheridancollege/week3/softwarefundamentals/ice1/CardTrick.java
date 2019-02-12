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
        Card crd1= new Card();
        
        Scanner usercard = new Scanner(System.in);
        int random;
        int card;
        String suit;
        
        
        crd1.setValue(0);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13 + 1));
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 3 + 1)]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
       /* System.out.println("Enter your card value");
        card= usercard.nextInt();
                
        System.out.println("Enter your suit value");
        suit = usercard.next();
        boolean answer = true;*/
        
        // and search magicHand here
        //magic hand code
        /*for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue() == card && magicHand1.getSuit().equals(suit)) {
                if (magicHand1.getValue() == 13 && "Daimond".equals(magicHand1.getSuit())) {
                    answer=true;
                    break;
                }
                else{
                    answer=false;
                }
            }*/
        
        //Lucky Card code
     Card LuckyCard= new Card();
        LuckyCard.setValue(7);
        LuckyCard.setSuit("Heart");
        boolean answer = true;
        
        for(int i=0;i<magicHand.length;i++){
            if(magicHand[i].getValue()==LuckyCard.getValue() && magicHand[i].getSuit()==LuckyCard.getSuit()){
                answer=true;
                break;
            }
            }
        
        if(answer==true){
            System.out.println("You win!!!!");
        }
        else{
              System.out.println("You Loose!!!");
         }
    }
    
}
