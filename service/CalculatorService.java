package service;

import calculator.*;
import ui.*;

public class CalculatorService {

    private static Calculator cal = new BasicCalculator();
    private static String[] operator = new String[] {" + ", " - ", " x ", " ÷ ", " % ", " ^ ", " √"};

    private static void result(double v1, double v2, int n) {
        System.out.print("\nResult: " + v1 + operator[n] + v2 + " = ");
    }

    public static void addition(int n) {
        double v1 = InputHandler.input();
        double v2 = InputHandler.input();
        cal = new BasicCalculator(v1, v2);

        result(v1, v2, n);
        System.out.println(cal.add());
    }

    public static void subtraction(int n) {
        double v1 = InputHandler.input();
        double v2 = InputHandler.input();
        cal = new BasicCalculator(v1, v2);

        result(v1, v2, n);
        System.out.println(cal.subtract());
    }

    public static void multiplication(int n) {
        double v1 = InputHandler.input();
        double v2 = InputHandler.input();
        cal = new BasicCalculator(v1, v2);

        result(v1, v2, n);
        System.out.println(cal.multiply());
    }

    public static void division(int n) {
        double v1 = InputHandler.input();
        double v2 = InputHandler.input();

        if(v2 != 0) {
            cal = new BasicCalculator(v1, v2);
            result(v1, v2, n);
            System.out.println(cal.divide());
        } else {
            System.out.println("\nError: Division by zero is not allowed.");
        }
    }

    public static void modulus(int n) {
        double v1 = InputHandler.input();
        double v2 = InputHandler.input();

        if(v2 != 0) {
            cal = new BasicCalculator(v1, v2);
            result(v1, v2, n);
            System.out.println(cal.modulo());
        } else {
            System.out.println("\nError: Modulus by zero is not allowed.");
        }
    }

    public static void power(int n) {
        double v1 = InputHandler.input();
        double v2 = InputHandler.input();
        cal = new ScientificCalculator(v1, v2);

        result(v1, v2, n);
        System.out.println(cal.pwr());
    }

    public static void squareRoot(int n) {
        double v = InputHandler.input();
        cal = new ScientificCalculator(v);
        if(v >= 0) {
            System.out.println("\nResult: " + operator[n] + v + " = " + cal.sqrt());
        } else {
            System.out.println("\nError: Square root of negative number is not allowed.");
        }
    }
}
