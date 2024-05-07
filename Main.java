public class Main {
    public static void main(String[] args) {
        double totalPrice = 0.00;
        showMenu();
        Bread bread = new Bread();
        totalPrice += bread.getPrice();
        System.out.printf(
                "You selected %s bread which costs $%.2f.\n", bread.getName(), bread.getPrice());
    }

    // Prints menu of bread options
    public static void showMenu() {
        System.out.println("=== Select Sandwich Bread: ===\n" +
                "1. White Bread $1.50\n" +
                "2. Wheat Bread $1.60\n" +
                "3. French Bread $1.80\n" +
                "4. Organic Bread $2.00\n");
    }
}