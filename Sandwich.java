public class Sandwich {
    private double totalCost;

    // Sandwich constructor
    public Sandwich() {
        totalCost = getPrice() + 0.00;
    }

    // Prints menu of bread options
    public void showBreadMenu() {
        System.out.println("=== Select Sandwich Bread: ===\n" +
                "1. White Bread $1.50\n" +
                "2. Wheat Bread $1.60\n" +
                "3. French Bread $1.80\n" +
                "4. Organic Bread $2.00\n");
    }
}
