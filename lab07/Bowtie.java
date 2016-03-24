import java.util.Scanner;
//
//
public class Bowtie{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
int nStars = 9;
// #1 in lab
//while(true){ // infinte loop for the entire code
while( nStars == 9 ){
   {
            for(int apples = 0; apples < nStars; ){
                System.out.println("*********");
        }// end of for loop
    }
} //end of while loop



//input between 3 and 33 inclusive #4 on lab
System.out.println("Please input an odd number between 3 and 33 inclusively.");
while( true ){
    if ( myScanner.hasNextInt() ){
        nStars = myScanner.nextInt();
            if(( nStars >= 3) && (nStars <= 33 ) && (nStars % 2 == 1 )){
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


        
        
        
//} //end of infinte loop for the entire code   
    } //end of main method
} //end of public class