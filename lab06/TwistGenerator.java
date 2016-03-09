import java.util.Scanner;
//print input out as a simple "twist" on the screen
//using while() loop, modulus, if-else statements
public class TwistGenerator{
    public static void main(String [] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Please input a length: ");
        int lengthnum = -1; //length being assigned can not be less than zero
        
        while(true){ //will run if true
            
        
            lengthnum = myScanner.nextInt();
            
                if(lengthnum < 0){
                    System.out.println("Sorry, you must input a positive integer.");
                    System.out.println("Please input a length: ");
                    return;
                    
                } //end of nested  if statement
                
                
           
             
             
        } //end of while statment
        
        //calculations
        
        
    }
}