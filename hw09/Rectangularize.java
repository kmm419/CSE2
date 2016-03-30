import java.util.Random; //import statement for random number
import java.util.Scanner; //import statement for imput
//writing methods, overloading methods, and asking user for good input
//Kimberly Mejia, CSE002
public class Rectangularize{ //public class
    public static void main(String[] args){ //main method
        
        Scanner myScanner = new Scanner(System.in); //scanner construction
        System.out.println("Please provide a number or word: "); //print statement, asking user for inpu
        
        int userInput1 = 0; //intialize userInput1
        String userInput2 = ""; //intialize userInput2
        
        // can either input an integer or a string, depending on what it is.
        if(myScanner.hasNextInt()){
            userInput1 = myScanner.nextInt();
            rectangle(userInput1); //calling the method
        }
        else{
            userInput2 = myScanner.nextLine();
            rectangle(userInput2); //calling the method
        }
    } //end of main method

public static void rectangle(int b){ //rectangle method - integer
    System.out.println("Output: ");
    int c = 0; //intialize c
    for(int a = 0; a < b; a++){ //initialize a, a will always be less than b, post increment a
        for(int d = 0; d < b; d++){ //initialize d, d will always be less than b, post increment d
            System.out.print("%"); //print % symbol 
        }
            System.out.println(); //print statement, new line
    }
} //end of method - integer

public static void rectangle(String a){ //rectangle method - string
        System.out.println("Output: "); //print statement
        System.out.println(); //print statement, new line
    int word = a.length(); //initialize word, counts how many letters are in the word

    for(int b = 0;b < word;b++){ //initialize b, b is less than word, post increment word
        System.out.println(a); //print statement, prints the word as many times as there are letters in the word
    }
} //end of method with (string)


} //end of public class