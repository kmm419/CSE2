import java.util.Random; //import statement for random number
import java.util.Scanner; //import statement for imput
//writing methods, overloading methods, and asking user for good input
//Kimberly Mejia, CSE 002
public class Games{ //public class
    public static void main(String[] args){ //main method
        
        Scanner myScanner = new Scanner(System.in); //calling the Scanner construction
        System.out.println("Welcome to Lehigh's Game Center! Pick a game: Guess the Box, Spin the Wheel, and Scrambler. "); //print statement, asking user for name of game
        
        String nameOfGame = myScanner.nextLine(); //storing name of game in variable
        String game1 = "Guess the Box"; //initializing game1
        String game2 = "Spin the Wheel"; //initializing game2
        String game3 = "Scrambler"; //intializing game3
        
   
        if(nameOfGame.equals(game1)){ //comparing input with variable
            guessTheBox(); //calling method
        }
        else if(nameOfGame.equals(game2)){ //comparing input with variable
            spinTheWheel(); //calling method
        }
        else if(nameOfGame.equals(game3)){ //comparing input with variable
            scrambler(); //calling method
        }
        else{
            System.out.println("Sorry, we don't have this game. Please pick an available game. "); //print statement, exits program
        }
        
    } //end of main method



public static void guessTheBox() { //guessTheBox method
        Random randomGenerator = new Random(); //create the random object()
        int randomInt = randomGenerator.nextInt(4); //generates integers less than 4
        
        Scanner myScanner = new Scanner(System.in); //calling the Scanner construction
        
        System.out.print("Welcome to Guess the Box!"); //print statement
        System.out.print("Please select a number: 1, 2, or 3 for your box selection. "); //print statement, asking user for input
    
        //get number of box from random number generator that's not zero
        int max = 4;
        int min = 1;
        int randomDigit = randomGenerator.nextInt(max - min) + min;
        
        int input; //intialize variable
    while(true){ //while loop
        if(myScanner.hasNextInt()){ //if statement, blocked until there is enough information
            input = myScanner.nextInt(); //user input
            if((input >= 1) && (input <= 3)){ //input must be between 1 and 3, inclusive
                break; //exits loop
            }
            else{
                System.out.println("no. Please type input again: "); //print statement, asking for user input again
                myScanner.nextLine(); //user's input
            }
        }
        else{
                System.out.println("no. Please type input again: "); //print statement, asking for user input again
                myScanner.nextLine(); //user's input
        }
    }
        if(input == randomDigit){ //compares user input with random digit
        System.out.println("Congratulations, you won a self high-five!"); //print statement
        
        }
        else{
            System.out.println("Sorry, you lost."); //print statement
        }
        
        System.out.println("The winning box is: " + randomDigit); //displays statement and the randomly generated number
    } //end of guessTheBox method
    
public static void spinTheWheel(){ // spinTheWheel method
    Random randomGenerator = new Random(); //create the random object()
    
    int randomInt1 = randomGenerator.nextInt(5); //generates random numbers 1-5
    int randomInt2 = randomGenerator.nextInt(2); //generated random numbers 1-2
    
    Scanner myScanner = new Scanner(System.in); //calling the Scanner construction
    
    System.out.print("Please input a color, red or black and a number, 1-5, inclusive: "); //print statement
           
    String userColor = myScanner.next(); //user's input
    String userInput = myScanner.next(); //user's input
            //a switch to decide if you wan to ask again
            boolean acceptable1 = false;
        while(!acceptable1){
            //checks input
            if(userColor.toLowerCase().equals("red") || userColor.toLowerCase().equals("black"))
                acceptable1 = true; //if so, stores it
            else{
                System.out.print("Try again: "); //asks user for input again
                userColor = myScanner.next(); //user's input
            }
        } 
            //a switch to decide if you want to ask again
            boolean acceptable2 = false;
        while(!acceptable2){
            //checks input
            if(userInput.equals("1") || userInput.equals("2") || userInput.equals("3") || userInput.equals("4") || userInput.equals("5"))
                acceptable2 = true; //if so, stores it
            else{
                System.out.print("Try again: "); //asks user for input again
                userInput = myScanner.next(); //user's input
            }
        }
            
        //make a winning case
        String randColor = "";
        String randNumber= "";
        
        //switch statement for color
            switch(randomInt2){
                case 0: 
                    randColor = "red";
                    break;
                case 1:
                    randColor = "black";
                    break;
            }
        //switch statement for number
            switch(randomInt1){
                case 0:
                    randNumber = "1";
                    break;
                case 1:
                    randNumber = "2";
                    break;
                case 2:
                    randNumber = "3";
                    break;
                case 3:
                    randNumber = "4";
                    break;
                case 4:
                    randNumber = "5";
                    break;
            }
            
            String spin = randColor + " " + randNumber; //initialize variable spin
            String guess = userColor + " " + userInput; //intialize variable guess
            
            System.out.println("The random guess is:" + " " + spin); //print statement, random guess
        
        if(guess.equals(spin)){ //if input equals randonmly generated color and number
            System.out.println("You win!"); //print statement
        }
        else{
            System.out.println("Sorry, your input doesn't match the random color and number."); //print statement
        }
}
        
public static void scrambler(){ // scrambler method
    Random randomGenerator = new Random(); //create the random object()
    
    Scanner myScanner = new Scanner(System.in); //calling the Scanner construction
    
    System.out.print("Please input a word: "); //print statement
    String userWord = myScanner.next(); //user's input
    int a=userWord.length(); //finds length of input
    int randomInt = randomGenerator.nextInt(a); //generated random numbers up to length
    char ranChar1 = userWord.charAt(randomInt); //copies the character at a random place
    char ranChar2 = userWord.charAt(0); //copies the character at 0
    String ranLetter = userWord.substring(1,randomInt); //copies the characters from one form to another
    System.out.println(ranChar + ranLet + ranChar2); //print statement
    
    
 
} //end of scrambler method

} //end of public class