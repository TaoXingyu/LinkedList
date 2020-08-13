import java.util.Scanner;
public class CarLeaseCost {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scnr = new Scanner(System.in);
	      int downPayment; 
	      int paymentPerMonth; 
	      int numMonths;
	      int totalCost; // Computed total cost to be output

	        
	      System.out.print("Enter down payment: ");
	      downPayment = scnr.nextInt();

	      System.out.print("Enter monthly payment: ");
	      paymentPerMonth = scnr.nextInt();

	      System.out.print("Enter number of months: ");
	      numMonths = scnr.nextInt();
	        
	      totalCost = downPayment + (paymentPerMonth * numMonths);
	        
	      System.out.println("Total cost: " + totalCost);
	}

}
