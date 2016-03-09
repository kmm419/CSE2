//create the Unix spinner effect
//practice while statment 
public class TextSpinner{ //start a new class
    
    public static void main(String[] args ){ //main method required for every Java program
        while(true){  //while statement - infinite loop
            System.out.print("/"); //print statement
                System.out.print("\b"); //erases previous statement
            System.out.print("-"); //print statement
                System.out.print("\b"); //erases previous statement
            System.out.print("\\"); //print statment
                System.out.print("\b"); //erases previos statment
            System.out.print("|"); //print statement
                System.out.print("\b"); //erases previos statement
        
        } //end of while loop
    } //end of main method
} //end of public class
