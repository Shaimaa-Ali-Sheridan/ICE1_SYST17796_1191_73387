/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random; 
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @version  1.0
 * @modifier name: Virajkumar Padhiyar Student id - 991510800
 * Date - 11th Feb,2019
 */
public class CardTrick {
   int a[]=new int[7];
   int card;
   char type,random_type;
    public static void main(String[] args)
    {
        Random r = new Random();
        Card[] a = new Card[7];
        String suit ="";
        int card;
        Scanner in = new Scanner(System.in);
        
          for (int i=0; i<a.length; i++)
            {
               Card c = new Card();
               int val;
               String x;
               c.setValue(r.nextInt((13 - 0) + 1) + 0);
               c.setSuit(Card.SUITS[r.nextInt(3) + 0]);
               a[i]=c;
               System.out.println(c.getValue());
               System.out.println(c.getSuit());
           }
        boolean check = false;
         System.out.println("pick card =  ");
        card = in.nextInt();
        System.out.println("suit = ");
        suit = in.next();

         for (int i=0; i<a.length; i++)
          {
           int m = a[i].getValue();
           String m1 =a[i].getSuit();


           if(card ==  m && suit.equals(m1))
               {
                check = true;

                }
           }
         
         if(check == true)

                System.out.println(" match :) ");
           else
                System.out.println("no match :(");
              char ch = suit.charAt(0);
              CardTrick1 luckyCard= new CardTrick1(card,ch);
              luckyCard.result();
    }
        void CardTrick1(int x, char ch)
	 	{
	 		card=x;
	 		System.out.println("CARD PICKED: "+card);

	 		type=ch;
	 		Random rand = new Random();
	 		for(int i=0;i<a.length;i++)
	 		{
	 			a[i]=rand.nextInt(14);// generate random no inbetween 0 to 13
	 			if(a[i]==0)
	 		 	{
	 				a[i]=rand.nextInt(14);
	 			}
	 		}
	 		for(int j=0;j<7;j++)
	 		{
	 			System.out.print("	:"+a[j]);
	 		}


	 		int s=rand.nextInt(5);//0='C' 1='D' 2='H' 3='S'
	 		switch(s)
	 		{
	 			case 0:
	 				random_type='C';
	 				System.out.println("\n\n random_type: "+random_type);
	 				return;
	 			case 1:
	 				random_type='D';
	 				System.out.println("\n\n random_type: "+random_type);
	 				return;
	 			case 2:
	 				random_type='H';
	 				System.out.println("\n\n random_type: "+random_type);
	 				return;
	 			case 3:
	 				random_type='S';
	 				System.out.println("\n\n random_type: "+random_type);
	 				return;
	 			default:
	 				random_type='Z';
	 				System.out.println("Default part...");
	 		}



	 	}
	 	void result()
	 	{
	 		int i;
	 		for(i=0;i<a.length;i++)
	 		{
	 			if(card==a[i])
	 			{
	 				if((type==random_type) || (type==random_type+32))
	 				{
	 					System.out.println("\nYOU winner.... :) ");
	 					return;
	 				}
	 			}
	 		}
	 		if(i==7)
	 		{
	 			System.out.println("\nBETTER LUCK NEXT TIME :( ");
	 		}
	 	}
}

