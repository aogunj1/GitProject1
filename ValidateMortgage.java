package gitProject1;

import java.text.NumberFormat;
import java.util.Scanner;

public class ValidateMortgage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		validateUser();

System.out.println("ACCESS GRANTED");
System.out.println("MORTGAGE CALCULATOR");
System.out.println(". . . . . .");
	
	
		System.out.println("Principal is : ");
		double cost = scan.nextDouble();
		System.out.println("annual Interest Rate: ");
		double rate = scan.nextDouble();
		System.out.println("Period (yrs): ");
		double years = scan.nextDouble();


			double totalNumPayments = 12 * years;
			double monthlyRate = (rate / 100) / 12;

			double mortgage = cost * (monthlyRate * Math.pow(1 + monthlyRate, totalNumPayments))
					/ (Math.pow(1 + monthlyRate, totalNumPayments) - 1);
			String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
			System.out.println("The Monthly Mortgage Is : " + mortgageFormatted);  

	}
	public static void validateUser()
	{
		Scanner scan = new Scanner(System.in);
		   String user = "";
		   String pass = "";
		do {
			System.out.println("Please enter your username : ");
			user = scan.nextLine();
			System.out.println("Please enter your Password : ");
		    pass = scan.nextLine();
			
		}  
				//while(user != "abc" || pass != "def");
		   while(!user.equals("abc") || !pass.equals("def"));
	}
}
