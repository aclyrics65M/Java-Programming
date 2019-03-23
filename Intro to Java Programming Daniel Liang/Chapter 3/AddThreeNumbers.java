package chapter3;

import java.util.Scanner;

public class AddThreeNumbers {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Generate three random numbers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		// Prompt the user to enter the sum of the three digits
		System.out.print("What is the sum of " + number1 + " + " + number2 + " + " + number3 + "? ");
		int answer = input.nextInt();
		input.close();
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
				(number1 + number2 + number3 == answer));

	}

}
