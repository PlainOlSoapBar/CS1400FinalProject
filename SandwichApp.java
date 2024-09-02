import java.util.Scanner;

public class SandwichApp {
    public static void main(String[] args) {
        // test comment
        Scanner scnr = new Scanner(System.in);

        boolean continueOrder = true;
        while (continueOrder) {
            // Create a new sandwich
            Sandwich sandwich = new Sandwich();

            // Create a new order
            Order order = new Order(sandwich);

            // Print receipt
            SandwichIO.writeOrderToFile(order);

            // Asks if customer wants to order another sandwich
            continueOrder = order.orderAgain(scnr);
        }

        System.out.println("\nThank you for ordering!");
        scnr.close();
    }
}