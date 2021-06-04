package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Noman Mahmood
 * Date:   June 3rd, 2021
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        Random rand = new Random();
        
        //for (int i = 0; i < magicHand.length; i++) {
        for (int i = 0; i < magicHand.length-1; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(12)+1);
            c.setSuit(Card.SUITS[rand.nextInt(3)]);
            magicHand[i] = c;
        }
        
        Card c = new Card();
        c.setValue(0);
        c.setSuit("Clubs");
        magicHand[magichand.length] = c;

        // code to ask the user for Card value and suit, create their card
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a card value 1 to 13: ");
        int v = in.nextInt();
        System.out.println("Enter a card suit: Hearts, Diamonds, Spades, or Clubs");
        String s = in.next();
        
        boolean valueFound = false;
        boolean suitFound = false;
        
        // search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == v+1)
                valueFound = true;
            if (magicHand[i].getSuit().equals(s))
                suitFound = true;
        }
        
        // report the result here
        if(valueFound && suitFound)
            System.out.println("Found :)");
            
        else 
            System.out.println("Not Found :(");
                        
        
    }

}
