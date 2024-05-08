import java.util.Scanner;
import java.util.InputMismatchException;

public class Vegetables {
    private String name;
    private double price;

    // Constructor
    public Vegetables(Scanner scnr) {
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
            if (choice >= 1 && choice <= 8) {
                switch (choice) {
                    case 1:
                        return "Red Onions";
                    case 2:
                        return "Olives";
                    case 3:
                        return "Pickles";
                    case 4:
                        return "Lettuce";
                    case 5:
                        return "Green Peppers";
                    case 6:
                        return "Tomatoes";
                    case 7:
                        return "Cheese";
                    case 8: // Quit
                        return "";
                }
            }
            // else
            System.out.println(
                    "Invalid selection. Please select a vegetable [1,8] (Enter 8 to quit vegetable selection):");
            return select(scnr);
        } catch (InputMismatchException e) {
            System.out.println(
                    "Invalid selection. Please select a vegetable [1,8] (Enter 8 to quit vegetable selection):");
            scnr.next();
            return select(scnr);
        }
    }

    // Calculates and returns the price of the bread
    public static double price(String choice) {
        switch (choice) {
            case "Red Onions":
                return 0.05;
            case "Olives":
                return 0.10;
            case "Pickles":
                return 0.10;
            case "Lettuce":
                return 0.20;
            case "Green Peppers":
                return 0.25;
            case "Tomatoes":
                return 0.30;
            case "Cheese":
                return 0.50;
            default: // Quit
                return 0.00;
        }
    }
}