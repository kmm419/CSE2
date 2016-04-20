import java.util.Scanner;
import java.util.Random;
//
//
public class Search{
    public static void main(String [] args){

//list1(); //method list1 for array1
//list2(); //method list2 for array2


Scanner myScanner = new Scanner(System.in); 
        int userInput = 0;
// prompting the user to input a number greater than 0
System.out.print("Enter an int: ");
    while(true){
        if(myScanner.hasNextInt()){
            userInput = myScanner.nextInt();
                if(userInput <= 0){
                    break;
                }
                else{
                    return;  
                }
        }
        else{
            System.out.println(userInput + " was not found in the list");
        } //end of else statement
     
    } //end of while statement

} //end of main method
     
     //array1 - 50 spaces, filled with numbers between 0 and 100
public static int list1(){
int [] array1 = new int [50];
for(int i = 0; i < array1.length; i++){
    array1[i] = (int)(Math.random()*101);
}
return list1;
}

//linear search for max and min
public static int max(int[] list1){
    int max = 0;
    for(int i = 1; i < list1.length; i++){
        if(list1[i] > list1[max]){
            max = i;
            return max;
        }
    }
System.out.print("The maximum of array1 is: " + max);
}

public static int min(int[] list1){
    int min = 0;
    for(int j = 1; j < list1.length; j++){
        if(list1[j] < list1[min]){
            min = j;
            return min;
        }
    }
System.out.print("The minimum of array1 is: " + min);
}

} //end of public class