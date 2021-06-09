/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * @author Varshini Tokala (student#: 991635759)
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random ran = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(ran.nextInt(13)+1); //c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[ran.nextInt(4)]); //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            magicHand[i] = c;
            System.out.println(c.getSuit() + " "+ c.getValue());
        }
        
        // Checking if a user card is in the magic hand
        Card userCard = new Card();
        int value;
        String suit; 
        boolean found = false;
        
        //code to ask the user for Card value and suit, create their card

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of the card(1-13): ");
        value = scan.nextInt();
        System.out.print("Enter the suit of the card"+ Arrays.toString(Card.SUITS)+ ":");
        suit = scan.next();
        
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        System.out.println("Your Card is: " + value + " of " + suit);
        // and search magicHand here
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue() == userCard.getValue() && magicHand1.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        //Then report the result here
        if(found)
            System.out.println("Your card is found in the Magic Hand!");
        else
            System.out.println("Your card is not found in the Magic Hand!");
        
        //Set Lucky Card Object - edit made on github
        LuckyCard lc = new Card(); 

            lc.setValue(3);
            lc.setSuit(“Hearts);
    }
    
}
