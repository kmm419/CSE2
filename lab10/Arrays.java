import java.util.Scanner;
//one-dimensional arrays
//Kimberly Mejia CSE002
public class Arrays{
    public static void main(String [] args){
        
        Scanner myScanner = new Scanner(System.in); //accepts user input
        
        int randomSize = (int)((Math.random()*6) + 5); //for size of array - between 5 and 10
       
        System.out.println("Please enter "+randomSize+ " student names: "); //print statement - asking user for input
   
        String[] students; //declaration
        students = new String[randomSize]; //allocates space for the list itself
        
        int i = 0; //initialize i
        for(i = 0; i < randomSize; i++){ // a number between 5 and 10 - number of names
            students[i] = myScanner.nextLine(); //user input
        }
        
        int[] midterm; //declaration
        midterm = new int[randomSize]; //allocates space for list itself
        
        int j = 0; //initialize j
        for(j = 0; j < randomSize; j++){ //number of grades based on the number of students
            int randomGrade = (int)(Math.random()*101); //for midterm grades - between 0 and 100
                    midterm[j] = randomGrade; //the midterm grade will be between 0 and 100
        }
        System.out.println("Here are the midterm grades for the students above: "); //print statement
        int k; //intialize k
        for(k = 0; k < randomSize; k++){ //runs as many times as there are names
            System.out.println(students[k] + ": " + midterm[k]); //print statement
        }

    } //end of main method
} //end of pubic class