/* Import statements */
import java.awt.event.*;

public class CalculatorTypeNumber implements ActionListener {

    private String digit = null;

    public CalculatorTypeNumber(int numberObject) {
        digit = String.valueOf(numberObject);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String num = CalculatorUtilization.getNumberValue();

        //make sure "012" can't happen or user is inputing next number of expression
        if (num.equals("0") || newNumber) {
            CalculatorUtilization.setNumber(digit);
            newNumber = false;
        }
        //make sure there is less than 18 digits
        else if (CalculatorUtilization.numberOfDigits(num) < CalculatorUtilization.MAXIMUM_DIGITS) {
            CalculatorUtilization.setNumber( num + digit);
        }
    }

    //Those will be used in +, -, *, /, = to control the typing of numbers
    private static boolean newNumber = false;


    public static void startNewNum() {
        newNumber = true;
    }


    public static boolean hasNewNum() {
        //opposite -> when the user type in a newNum,
        // newNum becomes false, so the boolean is reversed
        return !newNumber;
    }

}


