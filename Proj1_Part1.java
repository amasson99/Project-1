/*******************************************************************
* Proj1_Part1.java
* <Alex Masson / Section B/ Thursday 4:30 - 6:30>
*
* This program is an appliance store is offering 3% financing for 12 months on any purchase .
*******************************************************************/
import java.util.*;// Add import line here to use the Scanner class

public class Proj1_Part1 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);// Declare a Scanner object here to be used for input

		String input; //read the user input as a String
		double financing = .03; //constant finance rate
		double financingprice;
		double purchaseprice; //what the purchasing price of the item is
		double months = 12;//constant months for financing calculations
		double monthlypayment; //what the monthly payment will be

		System.out.print("Enter the item to be purchased: ");
			item = in.nextLine();

		System.out.print("Enter the amount of the purchase:");
			input = in.nextLine();
			purchaseprice = Double.parseDouble(input);
			financingprice = purchaseprice * financing;
			monthlypayment = (purchaseprice + financingprice)/months;

		System.out.printf("Your monthly payment is $%.2f\n", monthlypayment);
		System.out.printf("Your total payment is $%.2f\n", purchaseprice + financingprice);
		System.out.printf("Amount paid in financing is $%.2f\n", financingprice);


  	in.close();//close the scanner
	} // end main
} // end class Lab1
