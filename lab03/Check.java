import java.util.Scanner; //import statement
//
//
public class Check{ 
    //main method required for every Java program
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //declare an instance of the Scanner object and call the Scanner constructor
        System.out.print("Enter the original cost of the check in the form xx.xx: "); //prompts the user for the original cost of the check
        double checkCost = myScanner.nextDouble(); //accepts user input
        System.out.print("Enter the percentage tip that you wish to pay as a whole number in the form of xx:"); //prompt the user for the tip % they wish to pay
        double tipPercent = myScanner.nextDouble(); //variable  for tip percentage
        tipPercent /= 100; //convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: "); //prompt the user for the number of people that went to dinner
        int numPeople = myScanner.nextInt(); //method that Scanner objects have
        
        double totalCost; //variable for total cost 
        double costPerPerson; //variable for cost per person
        int dollars, dimes, pennies; //storing whole dollar amounts, storing digits to the right of the decimal point
        totalCost = checkCost * (1 + tipPercent); //for the cost$
        costPerPerson = totalCost / numPeople; //finding individual costs
        dollars = (int)costPerPerson; // number of dollars in the total per person
        dimes = (int)(costPerPerson * 10) % 10; // number of dimes in the total per person
        pennies = (int)(costPerPerson *100) % 10; // number of pennies in the total per person
        System.out.println ("Each person in the group owes $" + dollars + '.' + dimes + pennies); //printing out the total in dollars, dimes, and pennies
        
    } //end of main method
} //end of class
