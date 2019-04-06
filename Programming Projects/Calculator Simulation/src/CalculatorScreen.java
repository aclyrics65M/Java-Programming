
// Package and Imports
import java.awt.*;
import javax.swing.*;

/* Class CalculatorScreen */
public class CalculatorScreen extends JPanel {

    /* List of Data Fields */
    private static final long serialVersionUID = 6018546535458821851L;
    private static final int SIZE_NUMBER = 5;
    private JButton javaButton1, javaButton2, javaButton3;
    private JButton javaButton4, javaButton5, javaButton6;
    private JButton javaButton7, javaButton8, javaButton9;
    private JButton javaButton0;

    private JButton buttonAdd, buttonMinus, buttonMultiply;
    private JButton buttonDivide, buttonSqrt, buttonDel;
    private JButton buttonEqual, buttonDot, buttonC;
    private JButton buttonInverse, buttonSign, buttonPercent;
    private JButton buttonMPlus, buttonMMinus, buttonMRC;

    /* CalculatorScreen constructor */
    public CalculatorScreen() {
        this.setLayout(new GridLayout(SIZE_NUMBER, SIZE_NUMBER, SIZE_NUMBER, SIZE_NUMBER));

        // Implement method to create the calculator buttons
        createCalculatorButtons();

        Font largerFont = new Font(buttonSign.getFont().getName(), Font.PLAIN, 16);

        buttonSign.setFont(largerFont);
        buttonAdd.setFont(largerFont);
        buttonMinus.setFont(largerFont);
        buttonMultiply.setFont(largerFont);
        buttonDivide.setFont(largerFont);

        // Implement method to insert the calculator buttons on the calculator screen
        calculatorButtonInsertion();
    }


    /* Void Method to create all calculator buttons */
    public void createCalculatorButtons() {

        javaButton1 = new JButton("1");
        javaButton2 = new JButton("2");
        javaButton3 = new JButton("3");
        javaButton4 = new JButton("4");
        javaButton5 = new JButton("5");
        javaButton6 = new JButton("6");
        javaButton7 = new JButton("7");
        javaButton8 = new JButton("8");
        javaButton9 = new JButton("9");
        javaButton0 = new JButton("0");

        buttonAdd = new JButton("+");
        buttonMinus = new JButton("\u2212");
        buttonMultiply = new JButton("\u00D7");
        buttonDivide = new JButton("\u00F7");
        buttonSqrt = new JButton("\u221A");
        buttonDel = new JButton("\u2190");
        buttonEqual = new JButton("=");
        buttonDot = new JButton(".");
        buttonC = new JButton("C");
        buttonInverse = new JButton("1/x");
        buttonSign = new JButton("\u00B1");
        buttonPercent = new JButton("%");
        buttonMPlus = new JButton("M+");
        buttonMMinus = new JButton("MR");
        buttonMRC = new JButton("MC");


    }

    /* Void method to add all the buttons to the calculator */
    public void calculatorButtonInsertion() {

        add(buttonMPlus);
        add(buttonMMinus);
        add(buttonMRC);
        add(buttonAdd);
        add(buttonDel);

        add(javaButton7);
        add(javaButton8);
        add(javaButton9);
        add(buttonMinus);
        add(buttonC);

        add(javaButton4);
        add(javaButton5);
        add(javaButton6);
        add(buttonMultiply);
        add(buttonInverse);

        add(javaButton1);
        add(javaButton2);
        add(javaButton3);
        add(buttonDivide);
        add(buttonPercent);

        add(buttonDot);
        add(javaButton0);
        add(buttonSign);
        add(buttonEqual);
        add(buttonSqrt);

    }

}
