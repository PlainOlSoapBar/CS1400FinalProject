public class Menu {
    public static void showBreadMenu() {
        System.out.println("=== Select Sandwich Bread: ===\n" +
                "1. White Bread $1.50\n" +
                "2. Wheat Bread $1.60\n" +
                "3. French Bread $1.80\n" +
                "4. Organic Bread $2.00\n");
    }

    public static void showVegetablesMenu() {
        System.out.println("=== Select Sandwich Vegetables: ===\n" +
                "1. Red Onions $0.05\n" +
                "2. Olives $0.10\n" +
                "3. Pickles $0.10\n" +
                "4. Lettuce $0.20\n" +
                "5. Green Peppers $0.25\n" +
                "6. Tomatoes $0.30\n" +
                "7. Cheese $0.50\n" +
                "8. Quit vegetable selection\n");
    }

    public static void showMeatsMenu() {
        System.out.println("=== Select Sandwich Meats: ===\n" +
                "1. Ham $1.00\n" +
                "2. Roasted Chicken Breast $1.10\n" +
                "3. Turkey Breast $1.20\n" +
                "4. Roast Beef $1.50\n" +
                "5. Quit meat selection\n");
    }
}
