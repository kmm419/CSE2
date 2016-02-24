import java.util.Scanner; //import statement
// program converting decimal inputs to hexidecimal outputs
// using import, switch statements, if/else statements, operators, and string manipulation
public class ToHex { //beginning of class
    //main method required for every Java program
    public static void main(String[] args) {
        
       
        //calling the Scanner construction
        Scanner myScanner = new Scanner (System.in); 
        
        
        //prompt user to enter three numbers
        //print statement
        System.out.print("Please enter three numbers representing RBG values: "); 
        int colorValue1 = -1; //first input
        int colorValue2 = -1; //second input
        int colorValue3 = -1; //third input
        
        //input for first integer, if not in range outputs error message, else if not an integer outputs error message
        if ( myScanner.hasNextInt() ){ //beginning of if statement
                colorValue1 = myScanner.nextInt();
        
                if ( colorValue1 < 0 || colorValue1 > 255 ){ //beginnin of nested if statement
                System.out.println("Sorry, you must enter values between 0-255.");
                return;
                } //end of nested if statement
        } //end of if statement
        else { //beginning of else statement
                System.out.println("Sorry, your input must contain integers.");
                return;
        } //end of else statement
        //input for second integer, if not in range outputs error message, else if not an integer outputs error message
        if ( myScanner.hasNextInt() ){ //beginning of if statment
                colorValue2 = myScanner.nextInt();
        
                if ( colorValue2 < 0 || colorValue2 > 255 ){ //beginning of nested if statement
                System.out.println("Sorry, you must enter values between 0-255.");
                return;
                } //end of nested if statement
        } //end of if statement
        else { //beginnig of else statement
                System.out.println("Sorry, your input must contain integers.");
                return;
        } //end of else statement
        //input for third integer, if not in range outputs error message, else if not an integer outputs error message
        if ( myScanner.hasNextInt() ){ //beginnig of if statement
                colorValue3 = myScanner.nextInt();
        
                if ( colorValue3 < 0 || colorValue3 > 255 ){ //beginning of nested else statement
                System.out.println("Sorry, you must enter values between 0-255.");
                return;
                } //end of nested if statement
        } //end of if statement
        else { //beginning else statement
                System.out.println("Sorry, your input must contain integers.");
                return;
        } //end of else statment
        //print out statement prompting user input
        System.out.println("The decimal numbers R: " + colorValue1 +" G: " + colorValue2 + " B: " + colorValue3 + " is represented in hexidecimal as:" );
        
        //calculations for conversion from decimal to hexidecimal for the three inputs
        //first, you divide the integer by 16
        //second, find the modulo of the integer by 16
        int d1Num = colorValue1 / 16;
        int r1Num = colorValue1 % 16;
      
        int d2Num = colorValue2 / 16;
        int r2Num = colorValue2 % 16;
    
        int d3Num = colorValue3 / 16;
        int r3Num = colorValue3 % 16;
        
        //switch statement converting decimal to hexidecimal for the first value (first letter/input)
        //quotient of the first integer calculation
        switch ( d1Num ){ //beginning of switch statement
            case 0: 
                System.out.print ("0");
                break;
            case 1:
                System.out.print ("1");
                break;
            case 2: 
                System.out.print ("2");
                break;
            case 3: 
                System.out.print ("3");
                break;
            case 4: 
                System.out.print ("4");
                break;
            case 5: 
                System.out.print ("5");
                break;
            case 6: 
                System.out.print ("6");
                break;
            case 7: 
                System.out.print ("7");
                break;
            case 8: 
                System.out.print ("8");
                break;
            case 9: 
                System.out.print ("9");
                break;
            case 10: 
                System.out.print ("A");
                break;
            case 11: 
                System.out.print ("B");
                break;
            case 12: 
                System.out.print ("C");
                break;
            case 13: 
                System.out.print ("D");
                break;
            case 14: 
                System.out.print ("E");
                break;
            case 15: 
                System.out.print ("F");
                break;
        } //end of switch statement
        //switch statement converting decimal to hexidecimal for the first value (second letter/number)
        //remainder of the first integer calculation
         switch ( r1Num ){ //beginning of switch statement
            case 0: 
                System.out.print ("0");
                break;
            case 1: 
                System.out.print ("1");
                break;
            case 2: 
                System.out.print ("2");
                break;
            case 3: 
                System.out.print ("3");
                break;
            case 4: 
                System.out.print ("4");
                break;
            case 5: 
                System.out.print ("5");
                break;
            case 6: 
                System.out.print ("6");
                break;
            case 7: 
                System.out.print ("7");
                break;
            case 8: 
                System.out.print ("8");
                break;
            case 9: 
                System.out.print ("9");
                break;
            case 10: 
                System.out.print ("A");
                break;
            case 11: 
                System.out.print ("B");
                break;
            case 12: 
                System.out.print ("C");
                break;
            case 13: 
                System.out.print ("D");
                break;
            case 14: 
                System.out.print ("E");
                break;
            case 15: 
                System.out.print ("F");
                break;
        } //end of switch statement
        // switch statement converting decimal to hexidecimal for the second value (first letter/number)
        //quotient of the second integer calculation
         switch ( d2Num ){ //beginning of switch statement
            case 0: 
                System.out.print ("0");
                break;
            case 1:
                System.out.print ("1");
                break;
            case 2: 
                System.out.print ("2");
                break;
            case 3: 
                System.out.print ("3");
                break;
            case 4: 
                System.out.print ("4");
                break;    
            case 5: 
                System.out.print ("5");
                break;
            case 6: 
                System.out.print ("6");
                break;
            case 7: 
                System.out.print ("7");
                break;
            case 8: 
                System.out.print ("8");
                break;
            case 9: 
                System.out.print ("9");
                break;
            case 10: 
                System.out.print ("A");
                break;
            case 11: 
                System.out.print ("B");
                break;
            case 12: 
                System.out.print ("C");
                break;
            case 13: 
                System.out.print ("D");
                break;
            case 14: 
                System.out.print ("E");
                break;
            case 15: 
                System.out.print ("F");
                break;
        } //end of switch statement
        //switch statement converting decimal to hexidecimal for for the second value (second letter/number)
        //remainder of the second integer calculation
         switch ( r2Num ){ //beginning of switch statement
            case 0: 
                System.out.print ("0");
                break;
            case 1: 
                System.out.print ("1");
                break;
            case 2:
                System.out.print ("2");
                break;
            case 3: 
                System.out.print ("3");
                break;
            case 4: 
                System.out.print ("4");
                break;
            case 5: 
                System.out.print ("5");
                break;
            case 6: 
                System.out.print ("6");
                break;
            case 7: 
                System.out.print ("7");
                break;
            case 8: 
                System.out.print ("8");
                break;
            case 9: 
                System.out.print ("9");
                break;
            case 10: 
                System.out.print ("A");
                break;
            case 11: 
                System.out.print ("B");
                break;
            case 12: 
                System.out.print ("C");
                break;
            case 13: 
                System.out.print ("D");
                break;
            case 14: 
                System.out.print ("E");
                break;
            case 15: 
                System.out.print ("F");
                break;
        } //end of switch statement
        // switch statement converting decimal to hexidecimal for the third value (firstletter/input)
        //quotient of the third integer calculation
         switch ( d3Num ){ //beginning of switch statement
            case 0: 
                System.out.print ("0");
                break;
            case 1: 
                System.out.print ("1");
                break;
            case 2: 
                System.out.print ("2");
                break;
            case 3: 
                System.out.print ("3");
                break;
            case 4: 
                System.out.print ("4");
                break;
            case 5: 
                System.out.print ("5");
                break;
            case 6: 
                System.out.print ("6");
                break;
            case 7: 
                System.out.print ("7");
                break;
            case 8: 
                System.out.print ("8");
                break;
            case 9: 
                System.out.print ("9");
                break;
            case 10: 
                System.out.print ("A");
                break;
            case 11: 
                System.out.print ("B");
                break;
            case 12: 
                System.out.print ("C");
                break;
            case 13: 
                System.out.print ("D");
                break;
            case 14: 
                System.out.print ("E");
                break;
            case 15: 
                System.out.print ("F");
                break;
        } //end of switch statement
        // switch statement converting decimal to hexidecimal for the third value (second letter/number)
        //remainder of the third integer calculation
         switch ( r3Num ){ //beginning of switch statement
            case 0:
                System.out.print ("0");
                break;
            case 1: 
                System.out.print ("1");
                break;
            case 2: 
                System.out.print ("2");
                break;
            case 3: 
                System.out.print ("3");
                break;
            case 4: 
                System.out.print ("4");
                break;
            case 5: 
                System.out.print ("5");
                break;
            case 6: 
                System.out.print ("6");
                break;
            case 7: 
                System.out.print ("7");
                break;
            case 8: 
                System.out.print ("8");
                break;
            case 9:
                System.out.print ("9");
                break;
            case 10: 
                System.out.print ("A");
                break;
            case 11: 
                System.out.print ("B");
                break;
            case 12: 
                System.out.print ("C");
                break;
            case 13: 
                System.out.print ("D");
                break;
            case 14: 
                System.out.print ("E");
                break;
            case 15: 
                System.out.print ("F");
                break;
        } //end of switch statement
        //used to start on a new line
        System.out.print("\n");
    
    } //end of main method
} // end of class