package ui;

public class Menu {
    private static String[] option = new String[] {"Addition", "Subtraction", "Multiplication", "Division", "Modulus", "Power", "Square Root"};

    public static void displayMenu() {
        System.out.println("\nSelect Operation:");
            for(int i = 0; i < option.length; i++) {
                System.out.println((i + 1) + " " + option[i]);
            }
        System.out.println();
    }
}
