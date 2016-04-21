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
                        System.out.print("New input must be less than last input given." );  
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
        binary(userInput,search); //calling the linear method
        
        scramble(userInput); //calling the scramble method
        System.out.print("Scrambled: ");
        for(int x = 0; x < userInput.length; x++){
            System.out.print(userInput[x] + " ");
        }
       
         System.out.println("Enter a grade to search for: ");
        int target = myScanner.nextInt();
        binary(userInput,target); //calling the linear method
    }//end of main method
        
    //method for binary search in an array 
    public static int[] binary(int[] list, int search){
        int j = 0;
        int min = 0;
        int max = list.length - 1;
        int middle;
        
        while(min <= max){
            j++;
            middle = ((min + max) / 2); //finds the middle element of the array
            if(list[middle] == search){
                System.out.println("Element " + search + " found with " + (j + 1) + " iterations.");
                break;
            }
            else if(list[middle] < search){ //divides the array to search in the top half
                min = middle + 1;
            }
            else if(list[middle] > search){ //divides the array to search in the bottom half
                max = middle - 1;
            }
            if(min > max){ //if it can't be found in the array
                System.out.println("Element " + search + " was not found with " + (j + 1) + " iterations.");
            }
        }
                return list; 
    } //end of linear search method
   
   //method for scrambling
   public static int[] scramble(int [] list2){
       
       for(int r = 0; r < list2.length; r++){
           int point = (int)(list2.length * Math.random());
           //replaces element positions
           int temp = list2[point];
           list2[point] = list2[r];
           list2[r] = temp;
       }
       return list2;
   }
    
} //end of public class    
    
 
    
    
    
         
        
    
