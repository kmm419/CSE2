import java.util.Scanner;
import java.util.Random;
//Kimberly Mejia CSE002
//
public class CSE2Linear{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        int s = 0; //intialize
        int search; //n
        int [] userInput; //declaration
        userInput  = new int [15]; //allocates space
        System.out.print("Enter 15 ints for final grades in CSE2: ");
        int h = 0; //initialize
        
    
            for(int a = 0; a < 15; a++){
                if(myScanner.hasNextInt()){
                    userInput[a] = myScanner.nextInt();
                // checks if input is between 0 and 100
                    if(userInput[a] >= 0 && userInput[a] <= 100){
                    //checks if current is larger than the last input number
                        if(userInput[a] >= s){
                            s = userInput[h];   
                        }
                        else{
                        System.out.print("New input is less than last input given.");  
                        return;
                        }
                    }
                    else{
                        System.out.print("Input was not in the range between 0 and 100."); 
                        return;
                    }
                }
                else{
                System.out.print("Input is not listed in least to greatest"); 
                return;
                }
                h++;
            }  
        System.out.print("Enter a grade to search for: ");
        search = myScanner.nextInt(); //asking the user for input
        linear(userInput,search); //calling the linear method
        
        scramble(userInput); //calling the scramble method
        System.out.print("Scrambled: ");
        for(int x = 0; x < userInput.length; x++){
            System.out.print(userInput[x] + " ");
        }
       
         System.out.print("Enter a grade to search for: ");
        int target = myScanner.nextInt();
        linear(userInput,target); //calling the linear method
    }//end of main method
        
    //method for li-near search in an array 
    public static int[] linear(int[] list, int search){
       int j = 0;
                for(int i = 0; i < list.length; i++){
                    if(search == list[i]){
                        System.out.println("Found it with " + (j + 1) + " iterations.");
                    }
                    else{
                        j++;
                    }
                }
                return list; 
    } //end of linear search method
   
   //method for scrambling
   public static int[] scramble(int [] list2){
       
       for(int r = 0; r < list2.length; r++){
           int point = (int)(list2.length * Math.random());
           
           int temp = list2[point];
           list2[point] = list2[r];
           list2[r] = temp;
       }
       return list2;
   }
    
} //end of public class    
    
 
    
    
    
         
        
    
