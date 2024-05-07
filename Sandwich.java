public class Sandwich extends Bread {
    private double totalCost;

    // Sandwich constructor
    public Sandwich() {
        totalCost = getPrice() + 0.00;
        System.out.println(totalCost);
    }
}
