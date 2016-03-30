import java.util.Scanner;
//print input out as a simple "twist" on the screen
//using while() loop, modulus, if-else statements
public class TwistGenerator{
    public static void main(String [] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Please input a length: ");
        int lengthNum = -1; //length being assigned can not be less than zero
         
//while statement        
        while(true){ //will run if true
            if(myScanner.hasNextInt()){
            lengthNum = myScanner.nextInt();
                if(lengthNum >= 0){
                    break;
                } //end of nested  if statement    
                    else{        
                    System.out.println("Sorry, you must input a positive integer. ");
                    myScanner.nextLine();
                    } //end of nested else statement
            }//end of outer if statement
            else{
                System.out.println("Sorry, you must input a postive integer. ");
                myScanner.nextLine();
            } //end of outer else statement
        } //end of while statment
        
//calculations
    int w = 3; //always be three lines
        for(int a = 1; a <= w; a++ ){ //
            for(int b = 1; b <= lengthNum; b++){
                if(b % w == 1){ // 
                    if(a == 1){
                        System.out.print("\\");
                    }
                    if(a == 2){
                        System.out.print(" ");
                    }
                    if(a == 3){
                    System.out.print("/");
                    }
                }
                if(b % w == 2){
                    if(a == 1){
                        System.out.print(" ");
                    }
                    if(a == 2){
                        System.out.print("X");
                    }
                    if(a == 3){
                        System.out.print(" ");
                    }
                }
                if(b % w == 0){
                    if(a == 1){
                        System.out.print("/");
                    }
                    if(a == 2){
                        System.out.print(" ");
                    }
                    if(a == 3){
                        System.out.print("\\");
                    }
                }
            }
            System.out.println();
        }
    } //end of main method
} //end of public class