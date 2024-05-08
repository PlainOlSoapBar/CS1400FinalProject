public class Order {
    private Sandwich sandwich;
    private double sandwichCost;
    private String customerName;
    private String timeStamp;

    // Constructor
    public Order(Sandwich sandwich) {
        this.sandwich = sandwich;
        this.sandwichCost = sandwich.getSandwichCost();
    }
}
