
// Import statements
import java.awt.BorderLayout;
import javax.swing.JFrame;

/* Class CalculatorMainFrame */
public class CalculatorMainFrame extends JFrame {

    /* Data Fields */
    private static final long serialVersionUID = -8026416994513756565L;
    public static final int CALCULATOR_HEIGHT = 400;
    public static final int CALCULATOR_WIDTH = 400;
    private CalculatorNumberField javaFieldObject;

    /* CalculatorMainFrame constructor */
    public CalculatorMainFrame() {


        javaFieldObject = new CalculatorNumberField(CALCULATOR_WIDTH - 10);

        // Implement the setTextField method of the Calculator Utilization class
        // Set the javaFieldObject to the javaTextField
        CalculatorUtilization.setTextField(javaFieldObject.javaTextField);

        // Inserting the components
        add(javaFieldObject, BorderLayout.NORTH);
        add(new CalculatorScreen());

        /* Configuration of the frame */
        setSize(CALCULATOR_WIDTH, CALCULATOR_HEIGHT);
        setTitle("Java Graphical Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }


}
