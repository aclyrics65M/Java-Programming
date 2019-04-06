
// Import statements
import java.awt.*;
import javax.swing.*;

public class CalculatorNumberField extends JPanel {

    private static final long serialVersionUID = 8901400055245008856L;
    private static final int HEIGHT = 50;

    JTextField javaTextField;

    public CalculatorNumberField(int SIZE) {

        javaTextField = new JTextField("0");
        javaTextField.setEditable(false);

        javaTextField.setBackground(Color.WHITE);
        javaTextField.setPreferredSize(new Dimension(SIZE, HEIGHT));
        javaTextField.setHorizontalAlignment(JTextField.RIGHT);

        javaTextField.setFont(new Font(javaTextField.getFont().getName(), Font.PLAIN, HEIGHT - 20));

        add(javaTextField);
    }


}
