import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

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
        timeStamp = getTimeStamp();
    }

    public String enterCustomerName() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter your name: ");
        scnr.close();
        return scnr.nextLine();
    }

    public String getTimeStamp() {
        Date date = new Date();
        DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        return defaultDate.format(date);
    }
}
