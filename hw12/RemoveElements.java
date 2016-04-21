import java.util.Scanner;
//Kimberly Mejia CSE 002
//Practice with Methods 
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  //method randomInput()
  public static int[] randomInput(){
    int[] randomArray; //declaration
    randomArray = new int [10]; //allocates space for itself
    int k = 0;
    for(k = 0; k <10 ; k++){
        int randomNum = (int)(Math.random()*10);
            randomArray[k] = randomNum;   
      }
      return randomArray;
  }
  
  //method delete(list,pos)
  public static int[] delete(int[] list, int pos){
      if(pos < 0 || pos >10){
          System.out.print("This index is not valid");
      }
    int[] delArray = new int [list.length - 1];
    for( int n = 0; n < list.length - 1; n++){
        
       if(n < pos){
           delArray[n] = list[n];
       }
       else if (n >= pos){
           delArray[n] = list[n + 1];
           
       }
    }
    return delArray;
  } //end of method delete
  
  
  //method remove(list,target)
  public static int[] remove(int[] list, int pos){
      int posCount = 0; //intialize variable for counting the target number
      for(int l = 0; l < list.length; l++){ //run through the array to count how many target numbers there are
          if(list[l] == pos){
              posCount++; //counter
          }
      }
      if( posCount == 0){
          System.out.println("Element " + pos + " was not found");
          return list;

      }
      else{
          System.out.println("Element " + pos + " was found");
      }
      int[] remArray = new int[(list.length - posCount)]; //how many items will be in the new array
      int newRemArray = 0;
      for(int m = 0; m < list.length; m++){
          if(list[m] == pos){ //check to see if the number is not the target
          }
          else{
             remArray[newRemArray] = list[m]; //if its not the number, add it to the new array
              newRemArray++; 
          }
      }
      return remArray;
  } //end of method remove(list, target)
 
}