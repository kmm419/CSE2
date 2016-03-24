import java.util.Scanner; //import scanner
//Kimberly Mejia, CSE002
//practice with modulus and patterns
//while loops, modulus, 
public class Twisty{ //start of a public class

    public static void main(String[] args){ //main method required for every Java program
    
    Scanner myScanner = new Scanner(System.in); //calling the scanner construction
    int length = 0; //variable length
    int width = 0; //variable width
    System.out.print("Input your desired length: "); //print statement
    
    while(true){ //beginning of infinite while loop
            if(myScanner.hasNextInt()){ //if statement, blocks until there is enough information
                length = myScanner.nextInt(); //user input
                    if(length <= 80){ //if statement, if length is less than or equal to 80
                        break; //exits the loop
                    } //nested if statement
                            else{ //else statement
                                System.out.print("Invalid input. Please enter length again: "); //print statement
                                myScanner.nextLine(); //allows user to re-type input
                            } //end of else statement
            } //end of if statement
            else{ //else statement, if not an integer
                System.out.print("Invalid input. Please enter an integer for length: "); //print statement
                myScanner.nextLine(); //allows user to re-type input
            } //end of else statement
    } //end of infinite while loop
    
    System.out.print("Input your desired width: "); //print statement
    
    while(true){ //while loop
            if(myScanner.hasNextInt()){ //if statement, blocks until there is enough information
                width = myScanner.nextInt(); //user input
                    if(width < length){ //if statement, if width is less than length
                        break; //exits the loop
                    } //nested if statement
                            else{ //else statement
                                System.out.print("Invalid input. Please enter width again: "); //print statement
                                myScanner.nextLine(); //allows user to re-type input
                            } //end of nested else statement
            } //end of if statement                
            else{ //else statement, if not an integer
                System.out.print("Invalid input. Please enter an integer for width: "); //print statement
                myScanner.nextLine(); //allows user to re-type input
            } //end of else statement
    } //end of infinite while loop
    int b = 0;
        for (int a = 0; a < width; a++){ //number of lines vertically
            for (b = 0; b < length; b++){ //number of lines horizontally
                if (b / width % 2 == 0){ //knowing what set to print
                    if(a == b % width) //
                    else if(width - 1 - a == b % width){ //else if statement, width input - 1 - width = length mod width input
                        System.out.print("/"); //print statement
                    } //end of if statement
                    else{ //else statement
                        System.out.print(" "); //else print statement
                    } //end of else statement
                } //end of if statement
                else{ //end of else statement
                    if(a == b % width){ //if statement, width = length mod width input
                        System.out.print("\\"); //print statement
                    } //end of if statement
                    else if(width - 1 - a == b % width){ //else if statement, 
                        System.out.print("#"); //print statement
                    } //end of else if statement
                    else{ //else statement
                        System.out.print(" "); //print statement
                    } //else statement
                } //end of else statement
            } //end of for loop
            System.out.println(); //print statement
        } //end of for loop
        
    
        
        
    } //end of main method
} // end of public class