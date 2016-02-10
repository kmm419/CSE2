public class Arithmetic {
    public static void main(String [] args) {
        int numPants = 3; //number of pair of pants
        int numShirt = 2; //number of shirts
        int numBelt = 1; //number of belts
        double paSalesTax = 0.06; //sales tax in PA
        double pantsPrice = 34.98; //price for one pair of pants
        double shirtPrice = 24.99; //price for one shirt
        double beltPrice = 33.99; //price for one belt
        
        double pantsResult = numPants * pantsPrice; //pants total with tax
        double shirtResult = numShirt * shirtPrice; //shirts total with tax
        double beltResult = numBelt * beltPrice; //belt total with tax
    
         
        double totalCost = pantsResult + shirtResult + beltResult; //total paid for the transaction
        
        
        double pantsTax = paSalesTax*numPants*pantsPrice; //shirt Tax
        double beltTax = paSalesTax*numBelt*beltPrice; //belt tax
        double shirtTax = paSalesTax*numShirt*shirtPrice; //pants tax
        double totalSalesTax = totalCost*paSalesTax; //total tax for this transaction
        double transaction = totalSalesTax+totalCost; //total paid for the transaction
       
    
        System.out.println("Total cost of belt before tax: $" + (double) ((int) (beltResult*100))/100); 
        System.out.println("Total cost of shirts before tax: $"+(double) ((int) (shirtResult*100))/100); 
        System.out.println("Total cost of pants before tax: $"+ (double) ((int) (pantsResult*100))/100); 
        System.out.println("Sales tax charged for belt before tax: $"+(double) ((int) (beltTax*100))/100); 
        System.out.println("Sales tax charged for pants: $"+(double) ((int) (pantsTax*100))/100); 
        System.out.println("Sales tax charged for shirts: $"+ (double) ((int) (shirtTax*100))/100); 
        System.out.println("Subtotal: $"+ (double) ((int) (totalCost*100))/100);
        System.out.println("Total sales tax: $"+ (double) ((int) (totalSalesTax*100))/100);
        System.out.println("Total paid for this transaction: $"+ (double) ((int) (transaction*100))/100);    
       
    
    }
}