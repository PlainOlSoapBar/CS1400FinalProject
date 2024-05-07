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
                    return "white";
                case 2:
                    return "wheat";
                case 3:
                    return "french";
                case 4:
                    return "organic";
            }
        }
        // else
        System.out.print("Invalid selection. ");
        return getBreadName(scnr);
    }

    // Calculates and returns the price of the bread
    public double getBreadPrice(String choice) {
        switch (choice) {
            case "white":
                return 1.50;
            case "wheat":
                return 1.60;
            case "french":
                return 1.80;
            // case "organic":
            default:
                return 2.00;
        }
    }
}