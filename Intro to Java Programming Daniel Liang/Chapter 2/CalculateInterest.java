package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateInterest {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = scanner.nextDouble();
		double annualInterestRate = scanner.nextDouble();
		scanner.close();
		
		double interest = balance * (annualInterestRate/1200);
		
		System.out.println("The interest is " + df.format(interest));
		
	}

}
