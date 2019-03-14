package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat ddf = new DecimalFormat("0.000");
		
		// Prompt user to input the points of the triangle
		System.out.print("Enter three points for a triangle: ");
		double x1Value = scanner.nextDouble();
		double y1Value = scanner.nextDouble();
		double x2Value = scanner.nextDouble();
		double y2Value = scanner.nextDouble();
		double x3Value = scanner.nextDouble();
		double y3Value = scanner.nextDouble();
		scanner.close();
		
		// Calculate the sides
		double side1 = Math.sqrt(Math.pow(x2Value - x1Value, 2) + Math.pow(y2Value - y1Value, 2));
		double side2 = Math.sqrt(Math.pow(x3Value - x1Value, 2) + Math.pow(y3Value - y1Value, 2));
		double side3 = Math.sqrt(Math.pow(x3Value - x2Value, 2) + Math.pow(y3Value - y2Value, 2)); 
		
		double side = (side1 + side2 + side3) / 2;
		
		// Calculate the area
		double areaOfTriangle = Math.sqrt(side *(side - side1)*(side - side2)*(side - side3));
		
		System.out.println("The area of the triangle is " + ddf.format(areaOfTriangle));
		
	}

}
