/* Calculator Utilization */

/* Import statements */
import javax.swing.JTextField;
import java.math.BigDecimal;

public class CalculatorUtilization {

    private CalculatorUtilization() {
        // Blank
    }

    // Static variable javaTextField
    public static JTextField javaTextField = null;

    public static void setTextField(JTextField textField) {
        javaTextField = textField;
    }

    public static String getNumberValue() {

        try {
            new BigDecimal(javaTextField.getText());
            return javaTextField.getText();

        } catch (NumberFormatException oe) {
            return "0";
        }

    }

    public static final int MAXIMUM_DIGITS = 18;

    public static int numberOfDigits(String string) {

        int numberDigits = 0;
        int lengthOfString = string.length();

        for (int j = 0; j < lengthOfString; j++) {

            if (string.charAt(j) >= '0' && string.charAt(j) <= '9') {
                numberDigits++;
            }
        }
        return numberDigits;
    }

    public static void setNumber(String javaString) {

        if(numberOfDigits(javaString) <= MAXIMUM_DIGITS) javaTextField.setText(javaString);
        else javaTextField.setText("Error: number is too big");
    }

    /* Method for trimming down size */
    public static String trimmingSizeToMaximumDigits(String objectString) {

        // Initial if statement
        if(!objectString.contains(".")) {
            return objectString;
        }

        int countNumber = 0;

        for(int k = 0; k < objectString.length(); k++) {
            if(objectString.charAt(k) >= '0' && objectString.charAt(k) <= '9') {
                countNumber++;
            }
            if(countNumber == MAXIMUM_DIGITS) {
                objectString = objectString.substring(0, k + 1);
                break;
            }

        }

        countNumber = 0;
        for (int i = objectString.length() - 1; i >= 0; i--) {
            char ch = objectString.charAt(i);
            if (ch == '0') {
                countNumber++;
            } else if (ch == '.') {
                countNumber++;
                break;

            } else {
                break;

            }
        }
        // Finalize the object string
        objectString = objectString.substring(0, objectString.length() - countNumber);

        return objectString;

    }



}
