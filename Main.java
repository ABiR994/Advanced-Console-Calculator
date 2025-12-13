import ui.*;
import service.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("===== ADVANCED CONSOLE CALCULATOR =====");
        while(true) {
            Menu.displayMenu();
            int choice = InputHandler.choice();

            switch(choice) {
                case 1:
                    CalculatorService.addition(0);
                    InputHandler.repeat();
                    break;
                case 2:
                    CalculatorService.subtraction(1);
                    InputHandler.repeat();
                    break;
                case 3:
                    CalculatorService.multiplication(2);
                    InputHandler.repeat();
                    break;
                case 4:
                    CalculatorService.division(3);
                    InputHandler.repeat();
                    break;
                case 5:
                    CalculatorService.modulus(4);
                    InputHandler.repeat();
                    break;
                case 6:
                    CalculatorService.power(5);
                    InputHandler.repeat();
                    break;
                case 7:
                    CalculatorService.squareRoot(6);
                    InputHandler.repeat();
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
                    break;
            }
        }
    }
}
