import java.util.Scanner;
import java.util.InputMismatchException;

public class Bread {
    private String name;
    private double price;

    // Constructor
    public Bread(Scanner scnr) {
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
        System.out.println("Please select a bread [1,4].");
        try {
            int choice = scnr.nextInt();

            // Escape code to remove the user's input from terminal (if supported)
            System.out.print("\033[1A\033[2K");

            if (choice >= 1 && choice <= 4) {
                switch (choice) {
                    case 1:
                        return "White";
                    case 2:
                        return "Wheat";
                    case 3:
                        return "French";
                    case 4:
                        return "Organic";
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
            case "White":
                return 1.50;
            case "Wheat":
                return 1.60;
            case "French":
                return 1.80;
            // case "Organic":
            default:
                return 2.00;
        }
    }
}