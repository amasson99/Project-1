/*******************************************************************
* Proj1_Part2.java
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
		String brand; //item user purchases
		String modelname;
		double salestax = .0615; //constant sales tax rate
		double taxtotal;
		double purchaseprice; //what the purchasing price of the item is
		double totalall;

		System.out.print("What brand of computer do you wish to purchase? ");
			brand = in.nextLine();

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
