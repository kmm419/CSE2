import java.util.Scanner;
//
//
public class Convert { //beginning of class
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in); //calling for the scanner construction
        
        double meters1 = 34.23; //input for first calculation
        double meters2 = 15.25; //input for second calculation
        double inchesPerMeter = 39.3701; //conversion between inches to meters
    
        System.out.print("Enter the distance in meters: " ); //prompt
        double meterstoinchesa = myScanner.nextDouble(); //accepts user input
        System.out.println("34.23 meters is " + (double)((int)(meters1*inchesPerMeter*10000))/10000 + " inches."); //prompt with first calculation
        
        System.out.print("Enter the distance in meters: " ); //prompt
        double meterstoinchesb = myScanner.nextDouble(); //accepts user input
        System.out.println("15.25 meters is " + (double)((int)(meters2*inchesPerMeter*10000))/10000 + " inches."); //prompt with second calculation 
        
      
    } //end of main method
} //end of class

