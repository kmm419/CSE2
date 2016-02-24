//A program that will pick a random card from a deck of 52 cards
//Each number represents one card, and suits are grouped 
//In all suits, card identities ascend in step with the card number
import java.util.*;
//
//
public class CardGenerator { //beginning of class
    //beginning of main method for every Java program
    public static void main (String[] args) {
        
    boolean suit = 0; //    
    int randomNumber = (int)(Math.random()*(upperBound+1))+baseNum; //
    int randomNumber2 = (int)(Math.random()*13+2); //
        
        
    if (suit == 1%13) { 
        return "Diamonds";
        
    }//return a number between 1-13
    
    if (suit == 14%26) {
        return "Clubs";
    
    }//return a number between 14-26
    
    if (suit == 26%39) {
        return "Hearts";
    
    }//return a number between 26-39
    
    if (suit == 40%52) {
        return "Spades";
        
    }//return a number between 40-52
    
    double numCard;
                
        switch (cardValue) { //beginning of switch - value of the card
            case value1: 
                numCard("Ace");
                break;
            case value2:
                numCard("1");
                break;
            case value3: 
                numCard("2");
                break;
            case value4:
                numCard("3");
                break;
            case value5:
                numCard("4");
                break;
            case value6:
                numCard("5");
                break;
            case value7:
                numCard("6");
                break;
            case value8:
                numCard("7");
                break;
            case value9:
                numCard("8");
                break;
            case value10:
                numCard("9");
                break;
            case value11:
                numCard("10");
                break;
            case value12:
                numCard("Jack");
                break;
            case value13:
                numCard("Queen");
                break;
            default:
                numCard("King");
                break;
        } //end of switch
                
                
         
         
         
    
        
        
        
        
    } //end of main method
} //end of class