import java.util.Random; //import statement for random number
import java.util.Scanner; //import statement for imput
//Kimberly Mejia CSE002
//basic experience in calling and declaring methods
public class lab09 {
    public static void main(String[] args) { //main method needed for every Java program
    
    Scanner myScanner = new Scanner(System.in); //calling the Scanner construction
 
    int userInput = -1;
    
    System.out.println("The " + sentenceAdjective() + " " + nounSubject() + " " + pastTenseVerb() + " " + "the " + sentenceAdjective() + " " + nounObject() +".");
   
    while(true){

        System.out.print("Would you like another random sentence? Enter '1' for yes or '0' for no. ");
                if (myScanner.hasNextInt()) {
            
                    userInput = myScanner.nextInt();
                    if (userInput == 1) {
                        System.out.println("The " + sentenceAdjective() + " " + nounSubject() + " " + pastTenseVerb() + " " + "the " + sentenceAdjective() + " " + nounObject() +".");
   
                    }
                    else if (userInput == 0) {
                        break;
                    }
                    else { //else statement, if not 1 or 0
                        System.out.println("Sorry, user input is not 1 or 0. Please re-type input: ");
                        return;
                    } //end of else statement
                }
                else { //else statement, if not an integer
                    System.out.print("Sorry, user input is not 1 or 0. Please re-type input: ");
                    myScanner.nextLine();
                }
    
    
            } //end of while loop  
        } //end of main method

    

    public static String sentenceAdjective() {
        Random randomGenerator = new Random(); //create the random object()
           
            int randomInt = randomGenerator.nextInt(10); //generates random integers less than 10

            String sentenceAdjective = "";
            
        switch (randomInt) {
            case 0:
                sentenceAdjective = "great";
                break;
            case 1:
                sentenceAdjective = "cute";
                break;
            case 2:
                sentenceAdjective = "ugly";
                break;
            case 3:
                sentenceAdjective = "beautiful";
                break;
            case 4:
                sentenceAdjective = "sad";
                break;
            case 5:
                sentenceAdjective = "crazy";
                break;
            case 6:
                sentenceAdjective = "clever";
                break;
            case 7:
                sentenceAdjective = "dramatic";
                break;
            case 8:
                sentenceAdjective = "flippant";
                break;
            case 9:
                sentenceAdjective = "fabulous";
                break;
        } //end of switch statement
        return sentenceAdjective;
    }


    public static String nounObject() {
         Random randomGenerator = new Random(); //create the random object()
            
            int randomInt = randomGenerator.nextInt(10); //generates random integers less than 10

            String nounObject = "";
            
            switch (randomInt) {
                case 0:
                    nounObject = "toy";
                    break;
                case 1:
                    nounObject = "ball";
                    break;
                case 2:
                    nounObject = "lightbulb";
                    break;
                case 3:
                    nounObject = "phone";
                    break;
                case 4:
                    nounObject = "computer";
                    break;
                case 5:
                    nounObject = "book";
                    break;
                case 6:
                    nounObject = "joke";
                    break;
                case 7:
                    nounObject = "food";
                    break;
                case 8:
                    nounObject = "apple juice";
                    break;
                case 9:
                    nounObject = "plants";
                    break;
            } //end of switch statement
            return nounObject;
        } //end of method


    public static String pastTenseVerb() {
         Random randomGenerator = new Random(); //create the random object()
            
            int randomInt = randomGenerator.nextInt(10); //generates random integers less than 10

            String pastTenseVerb = "";
            
            switch (randomInt) {
                case 0:
                    pastTenseVerb = "took";
                    break;
                case 1:
                    pastTenseVerb = "ran";
                    break;
                case 2:
                    pastTenseVerb = "read";
                    break;
                case 3:
                    pastTenseVerb = "spoke";
                    break;
                case 4:
                    pastTenseVerb = "learned";
                    break;
                case 5:
                    pastTenseVerb = "twerked";
                    break;
                case 6:
                    pastTenseVerb = "fought";
                    break;
                case 7:
                    pastTenseVerb = "displayed";
                    break;
                case 8:
                    pastTenseVerb = "annoyed";
                    break;
                case 9:
                    pastTenseVerb = "laughed";
                    break;

            } //end of switch statement
            return pastTenseVerb;
    } //end of method


    public static String nounSubject() {
         Random randomGenerator = new Random(); //create the random object()
            
            int randomInt = randomGenerator.nextInt(10); //generates random integers less than 10

            String nounSubject = "";
            
            switch (randomInt) {
                case 0:
                    nounSubject = "fox";
                    break;
                case 1:
                    nounSubject = "giraffe";
                    break;
                case 2:
                    nounSubject = "Brotatochip";
                    break;
                case 3:
                    nounSubject = "Ophrah";
                    break;
                case 4:
                    nounSubject = "Clifford";
                    break;
                case 5:
                    nounSubject = "Jood";
                    break;
                case 6:
                    nounSubject = "Beauty";
                    break;
                case 7:
                    nounSubject = "Beast";
                    break;
                case 8:
                    nounSubject = "Sunny";
                    break;
                case 9:
                    nounSubject = "Lucy";
                    break;
            } //end of switch statement
            return nounSubject;
        } //end of method




} //end public class