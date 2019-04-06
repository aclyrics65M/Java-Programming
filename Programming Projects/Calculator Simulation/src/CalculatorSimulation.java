/* Calculator Simulation*/

/* Import statements */
import javax.swing.SwingUtilities;

public class CalculatorSimulation {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorMainFrame();
            }
        });

    }

}
