public class Order {
    private String customerName;
    private Sandwich sandwich;
    private String timeStamp;
    private double totalCost;

    // Constructor
    public Order(Sandwich sandwich) {
        this.sandwich = sandwich;
    }
}
