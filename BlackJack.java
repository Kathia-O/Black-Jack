
/**
 * This is my recareation and simplified version of the game 21, also known as Black Jack.
 * 
 * @author Kathia Osuna
 * @version 9.25.17
 */
import java.util.Scanner;
import java.lang.Math;
public class BlackJack{
    //Instance Variables
    public int hit;//random card # between 1 and 10 from the deck
    public int gamesWon;//count the number of times they win/lose
    public int gamesLost;
    public int sum;//the sum of all cards
    public int card1; // make multiple card variables that add up to a total of that hand?
    public int card2;
    
    public void hand(){
        hit = 0;
        gamesWon = 0;
        gamesLost = 0;
        sum = 0;
        card1 = (int)((card1) * 10) + 1;//makes a random #???????????
        card2 = (int)((card2) * 10) + 1;//sets the range to What?
    }
    public void start(){
        int total = (card1) + (card2);
        char play = System.out.println("Your current total is " + (total) + ".");
        if(play = "y"){
            System.out.println("The total of your cards is " + (sum) + ".");
            char keepPlaying = System.out.println("Would you like to continue playing? y/n: ");
            if (keepPlaying = "y"){
                hit();///LEFT OFF HEREEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
            }
        } else {
            int close = 21 - (total);
            char num = System.out.println("Your cards add up to " + (total) + "." + "You were " + (close) + " away from 21.");
            char repeat = System.out.println("Would you like to start a new game? y/n: ");
            if (repeat = "y"){
                start();//should this be different to ensure the user gets new cards?
            } else {
                System.out.println("Thank you for playing.");
            }
        }
    }
    public void hit(){
        if ( ){
           //sum of hand < 21
        } else {
           //done
        }
    }
    public void win(){
        if 
    }
    public void lose(){
    
    }
    //how to ask them if they want to quit throughout the game??public void quit(){
    
    }
}

