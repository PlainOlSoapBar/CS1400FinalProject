import java.util.Scanner;

public class Order {
    private Sandwich sandwich;
    private double sandwichCost;
    private String customerName;
    private String timeStamp;

    // Constructor
    public Order(Sandwich sandwich) {
        this.sandwich = sandwich;
        this.sandwichCost = sandwich.getSandwichCost();
        customerName = enterCustomerName();
    }

    public String enterCustomerName() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter your name: ");
        scnr.close();
        return scnr.nextLine();
    }
}
