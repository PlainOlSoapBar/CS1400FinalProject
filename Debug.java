import java.util.ArrayList;

public class Debug {
    // Checks if bread details are correct
    public static void bread(Bread bread) {
        System.out.printf("%s bread - $%.2f\n", bread.getName(), bread.getPrice());
    }

    // Checks if vegetables details are correct
    public static void vegetables(ArrayList<Vegetables> vegetables) {
        for (int i = 0; i < vegetables.size(); i++) {
            System.out.printf("%s - $%.2f\n", vegetables.get(i).getName(), vegetables.get(i).getPrice());
        }
    }

    // Checks if meats details are correct
    public static void meats(ArrayList<Meats> meats) {
        for (int i = 0; i < meats.size(); i++) {
            System.out.printf("%s - $%.2f\n", meats.get(i).getName(), meats.get(i).getPrice());
        }
    }

    // Checks if sandwich cost is correct
    public static void sandwichCost(double sandwichCost) {
        System.out.printf("Total cost: $%.2f\n", sandwichCost);
    }
}
