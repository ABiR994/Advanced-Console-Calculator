package ui;
import java.util.*;

public class InputHandler {
    private static Scanner sc = new Scanner(System.in);

    public static int choice() {
        while (true) {
            System.out.print("Enter your choice: ");

            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                sc.nextLine();
                return choice;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine();
            }
        }
    }

    public static double input() {
        while (true) {
            System.out.print("Enter number: ");

            if (sc.hasNextDouble()) {
                double v = sc.nextDouble();
                sc.nextLine();
                return v;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine();
            }
        }
    }

    public static void repeat() {
        while (true) {
            System.out.print("\nDo you want another calculation? (y/n): ");
            String choice = sc.nextLine().trim();

            if(choice.equalsIgnoreCase("y")) {
                return;
            } else if(choice.equalsIgnoreCase("n")) {
                System.out.println("\nThank you for using Advanced Console Calculator. Goodbye!");
                System.exit(0);
            } else {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}
