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
 */
/** Name: Amika Ota, Student#: 991300653 **/
public class CardTrick{

    public static void main(String[] args) {
        String [] magicHand = new String[7];
        Card c = new Card();

        /**Computer: pick 7 random cards*/
        //set value and suit, then store each card to array
        for (int i = 0; i < magicHand.length; i++) {

            //generate random number and set the value
            //random min = 1, max=13
            int rNum = (int)(Math.random() * 12 + 1);

            String rNumStr = String.valueOf(rNum);
            //generate random suit and set the value
            //[] = min:0, max:3
            String rSuit = Card.SUITS[(int) (Math.random() * 4)];
            //store random card info into array

            String randomCard = rNumStr+rSuit;
            magicHand[i] = randomCard;
            System.out.println("Card-" + i + " Random Pick: " + magicHand[i] + "\n");
        }

        /**ask user to pick a card*/
        System.out.println("Please pick a card");
        int userNum = (int) (Math.random() * 12 + 1);
        //converet int to string
        String userNumStr = String.valueOf(userNum);

        //generate random suit and set the value
        //[] = min:0, max:3
        String userSuit = Card.SUITS[(int) (Math.random() * 2 + 1)];

        String userCard = userNumStr + userSuit;
        System.out.println("Your card: " + userCard);


        //check user's card and random cards are matching...
        int j = 0;
        while(j<7) {
            if (userCard.equals(magicHand[j])) {
                System.out.println("Congraturations! The matching card was found!");

                break;
            } else {
                j++;
                if(j==6){
                    System.out.println("");
                    System.out.println("I'm sorry! No matching card was found. Try again.");
                }
            }
        }

    }
}



