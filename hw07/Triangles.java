import java.util.Scanner; //import scanner
//Kimberly Mejia, CSE002
//practice with do-while loops, for loops, and while loops
//Print a specific format of numbers
public class Triangles{ //start of a public class
    
    public static void main(String[] args){ //main method required for every Java program
    
    Scanner myScanner = new Scanner(System.in); //calling the Scanner construction
    int userInput = 0; //variable for user input
    
    
    System.out.print("Please input an integer between 5 and 30, inclusive: "); //print statement
    
    while(true){ //while infinite loop
           if(myScanner.hasNextInt()){ //if statement - blocks until there is enough information
                userInput = myScanner.nextInt(); //user input
                    if((userInput >= 5) && (userInput <= 30)){ //conditional number must be between 5 and 30
                        break; //exits the loop
                    } //nested if statement
                    else{ //else statement - if not within range
                        System.out.print("Invalid input. Please enter an integer between 5 and 30, inclusive: "); //print statement
                        myScanner.nextLine(); //allows user to re-type input
                    } //end of else statement
            } //end of if statement
            else{ //else statement - if not an integer
                System.out.print("Invalid input. Please enter an integer between 5 and 30, inclusive: "); //print statement
                myScanner.nextLine(); //allows user to re-type input
            } //end of else statement
        
    } //end of infinite while loop
    // for loop
    System.out.println("FOR LOOP: "); //print statement
    int a = 1; //variable a
    int d = userInput - 1; //variable d equals input minus 1
    //for loop
    for(int b = 1; b <= userInput*2 - 1; b++){ //variable b, number lines that will be printed, adds 1 to b post-increment
        
        if(b <= userInput){ //if statement - b is less than or equal to user input, will run
            for(int c = 0; c < b; c++){ //variable c, c is less than b, adds 1 to c post-increment, for top half of triangle
                System.out.print(b); //prints outs value of b
            } //end of for statement
        } //end of if statement
        else{ //else statement, if not if then will run
            for(a= 0; a < userInput*2-b; a++){ //variable a has value of 0, number of digits on each line, adds 1 to a post-increment
                System.out.print(d); //prints out variable d
            } //end of for statement
        d--; //post decrement for value of d
       } //end of else statement
        System.out.println(); //print statement on a new line
    } //end of for statement
    
    
    
    
    System.out.println("WHILE LOOP: "); //print statement
    int f = 1; //variable f
    int e = userInput - 1; //variable e equals user input minus 1
    int g = 1; //variable g
    int h = 0; //variable h
    //while loop
    while(g <= userInput*2 - 1){ //while statement, number of lines that will be printed
     
        if(g <= userInput){ //if statement, g is less than or equal to user input, will run
            h = 0; //new value for variable h
                while(h < g){ //while statement, g is greater than h
                    System.out.print(g); //print statement
                    h++; //post increment for value of h
                } //end of while statement
       
        } //end of if statement
        else{ //else statement
            f = 0; //new value for variable f
                while( f < userInput*2 - g ){ //while statement
                    System.out.print(e); //print statement for value of e
                    f++; //post increment value of f
                } //end of while statement
                    e--; //post decrement after value for e is printed
        }
                    System.out.println(); //print statement on new line
                    g++; //post increment for value of g
    } //end of while statement
    
    //do while loop
   System.out.println("DO WHILE LOOP: ");
    int i = 1; //variable i
    int j = userInput - 1; //variable j equals user input minus 1
    int k = 1; //variable k
    int l = 0; //varaible l
    //do-while loop
    if(k <= userInput*2 - 1){ //if statement, is value is true, number of lines that will be printed
        do{
            if(k <= userInput){ //if statement, g is less than or equal to user input, will run
                l = 0; //new value for variable h
                if(l < k){ //if statement
                    do{ //while statement, g is greater than h
                        System.out.print(k);
                        l++;
                    }while(l < k); //while statement
                }
            }
        else{ //else statement
                i = 0; //value for variable i
                    if(i < userInput*2 - k ){ //if statement - if value is true, number of digits on each line
                        do{ //do statement
                            System.out.print(j); //print value for j
                            i++; //post increment for variable i 
                        } while( i < userInput*2 - k ); //while statement, number of digits on each line
                    } //end of if statement
                            j--; //post decrement after the print statement for variable j
        } //else statement
                            System.out.println(); //print statement on new line
                            k++; //post increment for value of k
        } while(k <= userInput*2 - 1); //while statement, number of lines that will be printed
    } //end of do statement
    
    } //end of main method
} //end of public class
