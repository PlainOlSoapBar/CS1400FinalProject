import java.util.Scanner;

public class Bread {
    private Scanner input = new Scanner(System.in);
    private String name;
    private double price;

    // Bread constructor
    public Bread() {
        name = getBreadName(input);
        price = getBreadPrice(name);
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
    public String getBreadName(Scanner scnr) {
        System.out.println("Please select a bread [1,4].");
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
        return getBreadName(scnr);
    }

    // Calculates and returns the price of the bread
    public double getBreadPrice(String choice) {
        switch (choice) {
            case "White":
                return 1.50;
            case "Wheat":
                return 1.60;
            case "French":
                return 1.80;
            // case "organic":
            default:
                return 2.00;
        }
    }

    // Checks if bread has proper name and price
    public void debugBread() {
        System.out.printf(
                "%s bread - $%.2f.\n", getName(), getPrice());
    }
}