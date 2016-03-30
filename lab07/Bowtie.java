import java.util.Scanner;
//
//
public class Bowtie{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
int userInput = 0;

//input between 3 and 33 inclusive #4 on lab
System.out.print("Please input an odd number between 3 and 33 inclusively: ");

while( true ){
    if ( myScanner.hasNextInt() ){
        userInput = myScanner.nextInt();
            if(( userInput >= 3) && (userInput <= 33 ) && (userInput % 2 == 1 )){
                System.out.println(" ");
                
                break;
            } //end if-nested loop
        else{ 
            System.out.println("Invalid input, enter again!");
            myScanner.nextLine();
        } //end of inside else
    }
    else{
        System.out.println("Invalid input, enter again!");
        myScanner.nextLine();
    }// end of outside else
     //end of if statement
} //end of while loop

int nStars = 9;
int a = userInput - 1;
int b = 1;
int c = 0;


while(true)
{ // infinte loop for the entire code
  
    
        
                
        
    } //end of while loop

        
        
        
   
    } //end of main method
} //end of public class