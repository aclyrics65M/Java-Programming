import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer value: ");
        int numberOne = scanner.nextInt();
        System.out.print("Enter the second integer value: ");
        int numberTwo = scanner.nextInt();
        
        scanner.close();
        
        int additionOfNumbers = numberOne + numberTwo;
        int subtractionOfNumbers = numberOne - numberTwo;
        int multiplicationOfNumbers = numberOne * numberTwo;
        double divisionOfNumbers = numberOne / numberTwo;
        
        // Display the output
        System.out.println("The results of arithmetic computations are: ");
        System.out.println("The addition of the two numbers are: " + additionOfNumbers);
        System.out.println("The subtraction of the two numbers are: " + subtractionOfNumbers);
        System.out.println("The multiplication of the two numbers are: " + multiplicationOfNumbers);
        System.out.println("The division of the two numbers are: " + divisionOfNumbers);
    
    }

}
