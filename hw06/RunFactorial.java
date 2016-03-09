import java.util.Scanner; //import Scanner
//calculates factorial of a number
//practice Scanner function, while statements, nested-if statements, for statments
public class RunFactorial{ //start of a new class
    
    public static void main(String[] args){ //main method required for every Java program
        
        Scanner myScanner = new Scanner(System.in); //calling the Scanner construction
        
        System.out.print("Please input an integer between 9 and 16 inclusively: "); //print statement - prompting the user for input
        int factorialInput = 0; //
        int total = 1; //
        
    while(true){ //while statment - infinite loop
            
        if(myScanner.hasNextInt()){ //if statement - blocks until there is enough information
            factorialInput = myScanner.nextInt(); //user input
                if((factorialInput >= 9) && (factorialInput <= 16)){ //if statement - conditional - input must be between 9 and 16 inclusively
                    System.out.print("Input accepted:"); //print statment
                      break; //exits the loop
                } //end of nested if statement
                        else{ //else statment - if the input is not within the range of 9 and 16 inclusive
                            System.out.println("Invalid input, enter again!"); //print statement
                            myScanner.nextLine(); //allows the user to re-type input
                        } //end of nested else statement
        } //end of outer if statement
            
        else{ //else statement - if the input is not an integer
                System.out.println("Invalid input, enter again!"); //print statment
                myScanner.nextLine(); //allows the user to re-type input
        } //end of outer else statement
        
    } //end of while loop
        for(int counter = 1; counter <= factorialInput ; counter++ ){ //for loop - calculations - intitialize and add value to counter variable
        //counter is less than or equal to factorialInput, post-increment +1 to counter
            total = total * counter; //total times counter is assigned to the total variable
        } //end of for loop
        System.out.println("\n" + factorialInput + "! = " + total); //print statement on a new line - input and calculation
    } //end of main method
} //end of public class
