import java.util.Scanner;
//
//
public class Pyramid { //beginning of class
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in); //calling the Scanner construction
        
        System.out.print("The square side of the pyramid is (input lenght): " ); //prompt
        double squarePyramid = myScanner.nextDouble(); //accepts user input
        double square;
        square = (int)squarePyramid; //input for square
        
        System.out.print("The height of the pyramid is (input length): "); //prompt
        double heightPyramid = myScanner.nextDouble(); //accepts user input
        double height;
        height = (int)heightPyramid; //input for the height
        
        double volume = ((square * square * height) / 3); // finding the volume using (lenght*width*height/3)
        System.out.println("The volume inside the pyramid is: " + volume); //prompt with calculations
        
    } //end of main method
} //end of class