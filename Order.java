import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

public class Order {
    private Scanner scnr;
    private Sandwich sandwich;
    private double sandwichCost;
    private String customerName;
    private String timeStamp;

    // Constructor
    public Order(Sandwich sandwich) {
        scnr = new Scanner(System.in);
        this.sandwich = sandwich;
        this.sandwichCost = sandwich.getSandwichCost();
        customerName = enterCustomerName(scnr);
        timeStamp = getTimeStamp();
    }

    // Gets customer's name
    public String enterCustomerName(Scanner scnr) {
        System.out.print("\nEnter your name: ");
        return scnr.nextLine();
    }

    // Gets timestamp
    public String getTimeStamp() {
        Date date = new Date();
        DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        return defaultDate.format(date);
    }

    // Asks if customer wants to order another sandwich
    public boolean orderAgain(Scanner scnr) {
        System.out.println("Continue to order more sandwiches? (y/n): ");
        String choice = scnr.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            return true;
        } else if (choice.equalsIgnoreCase("n")) {
            return false;
        }
        // If input is invalid
        System.out.print("Invalid selection. ");
        return orderAgain(scnr);
    }

    // Returns the order content
    public String getContent() {
        return timeStamp + ", " + customerName + ", " + sandwich.getContent() + ", "
                + String.format("$%.2f", sandwichCost);
    }
}
