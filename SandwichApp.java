public class SandwichApp {
    public static void main(String[] args) {
        boolean continueOrder = true;
        while (continueOrder) {
            // Create a new sandwich
            Sandwich sandwich = new Sandwich();
            // Create a new order
            Order order = new Order(sandwich);

            continueOrder = false; // temporary
        }
    }
}