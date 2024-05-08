import java.util.Scanner;
import java.util.InputMismatchException;

public class Meats {
    private String name;
    private double price;

    // Constructor
    public Meats(Scanner scnr) {
        name = select(scnr);
        price = price(name);
    }

    // Returns the name of the bread
    public String getName() {
        return name;
    }

    // Returns the price of the bread
    public double getPrice() {
        return price;
    }

    // Validates the user's input and returns the name of the bread
    public static String select(Scanner scnr) {
        try {
            int choice = scnr.nextInt();
            if (choice >= 1 && choice <= 5) {
                switch (choice) {
                    case 1:
                        return "Ham";
                    case 2:
                        return "Roasted Chicken Breast";
                    case 3:
                        return "Turkey Breast";
                    case 4:
                        return "Roast Beef";
                    case 5: // Quit
                        return "";
                }
            }
            // else
            System.out.print("Invalid selection. ");
            return select(scnr);
        } catch (InputMismatchException e) {
            System.out.print("Invalid selection. ");
            scnr.next();
            return select(scnr);
        }
    }

    // Calculates and returns the price of the bread
    public static double price(String choice) {
        switch (choice) {
            case "Ham":
                return 1.00;
            case "Roasted Chicken Breast":
                return 1.10;
            case "Turkey Breast":
                return 1.20;
            case "Roast Beef":
                return 1.50;
            default: // Quit
                return 0.00;
        }
    }
}