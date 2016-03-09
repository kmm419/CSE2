import java.util.Scanner; //import Scanner
//calculates Fibonacci numbers from given inputs
//practice while loops, nest if statements, and calculations
public class Fibonacci{ //start of a public class
    
    public static void main(String[] args){ //main method required for every Java program
    
    Scanner myScanner = new Scanner(System.in); //calling the Scanner construction

    int n1 = 0; //initialize variable n1
    int n2 = 0; //initialize variable n2 
    int n = 0; //initialize variable n
    int finalnum1 = 1;//initialize variable finalnum1
    int finalnum2 = 0; //initialize variable finalnum2
    System.out.print("Please input three positive integers. "); //print statement - prompting user for inputs
    
    System.out.print("\nEnter the first number in the sequence: " ); //print statement - prompting user for first input
    while(true){ //while statement - infinite loop
        if(myScanner.hasNextInt()){ //if statement - blocks until there is enough information
            n1 = myScanner.nextInt(); //first input
                if(n1 >= 0){ //nest if statement - input is greater or equal to 0
                  break; //exits the loop
                } //end of nested if loop
                    else{ //else statement - when the user input is less than 0
                        System.out.print("First input was not a postive integer. Re-enter the first number in the sequence: "); //print statement
                        myScanner.nextLine(); //allows the user to re-type input
                    } //end of nested else loop
        } //end of if statement
        
        else{ //else statement - if input is not an integer
                System.out.print("First input was not an integer. Re-enter the first number in the sequence: ");//print statment
                myScanner.nextLine();//allows the user to re-type input
        } //end of else statement
    } //end of while loop
    System.out.print("Enter the second number in the sequence: " ); //print statement - prompting user for second input
    while(true){ //while statement - infinite loop
        if(myScanner.hasNextInt()){ //if statement - blocks until there is enough information
            n2 = myScanner.nextInt(); //first input
                if(n2 >= 0){ //nest if statement - input is greater or equal to 0
                  break; //exits the loop
                } //end of nested if loop
                    else{ //else statement - when the user input is less than 0
                        System.out.print("Second input was not a postive integer. Re-enter the second number in the sequence: "); //print statement
                        myScanner.nextLine(); //allows the user to re-type input
                    } //end of nested else loop
        } //end of if statement
        
        else{ //else statement - if input is not an integer
                System.out.print("Second input was not an integer. Re-enter the second number in the sequence: ");//print statment
                myScanner.nextLine();//allows the user to re-type input
        } //end of else statement
    } //end of while loop
    System.out.print("How many custom Fibonacci numbers should be printed? "); //print statement - prompting user for total input
    while(true){ //while statement - infinite loop
        if(myScanner.hasNextInt()){ //if statement - blocks until there is enough information
            n = myScanner.nextInt(); //first input
                if(n >= 0){ //nest if statement - input is greater or equal to 0
                  break; //exits the loop
                } //end of nested if loop
                    else{ //else statement - when the user input is less than 0
                        System.out.print("Third input was not a postive integer. Re-enter the third number in the sequence: "); //print statement
                        myScanner.nextLine(); //allows the user to re-type input
                    } //end of nested else loop
        } //end of if statement
        
        else{ //else statement - if input is not an integer
                System.out.print("Third input was not an integer. Re-enter the third number in the sequence: ");//print statment
                myScanner.nextLine();//allows the user to re-type input
        } //end of else statement
    } //end of while loop
    System.out.println("The numbers are: "); //print statement
    System.out.print("\n"); //inserts a new line
    
    while(finalnum1 <= n){ //while statment and calculations
        System.out.print(n1); //prints the first input
        System.out.print("," + n2); //prints comma and second number
            finalnum2 = n1 + n2; //add the first and second input and assign to
            n1 = n2; //second input is assigned to the first variable 
            n2 = finalnum2; //third input is assigned to the second variable
            finalnum1 = finalnum1 + 1; //finalnum1 plus 1 is assigned to the finalnum1 variable
    } //end of while loop
    System.out.print("."); //print statement
    System.out.println(); //prints new line
        
    }//end of main method
}//end of public class