import java.util.ArrayList;
import java.util.Scanner;

public class Sandwich {
    private boolean continueOrder;
    private Scanner scnr;
    private Bread bread;
    private ArrayList<Vegetables> vegetables;
    private ArrayList<Meats> meats;
    private int index;
    private double sandwichCost;

    // Constructor
    public Sandwich() {
        scnr = new Scanner(System.in);
        sandwichCost = 0.00;

        // Order bread
        Menu.showBreadMenu();
        bread = new Bread(scnr);
        sandwichCost += bread.getPrice();

        // Order vegetables
        Menu.showVegetablesMenu();
        System.out.println("Please select a vegetable [1,8] (Enter 8 to quit vegetable selection):");
        vegetables = new ArrayList<Vegetables>();
        continueOrder = true;
        index = 0;
        while (continueOrder) {
            vegetables.add(new Vegetables(scnr));
            sandwichCost += vegetables.get(index).getPrice();
            index++;
            if (vegetables.get(vegetables.size() - 1).getName().equals("")) {
                vegetables.remove(vegetables.size() - 1);
                continueOrder = false;
            }
        }

        // Order meats
        Menu.showMeatsMenu();
        System.out.println("Please select a meat [1,5] (Enter 5 to quit meat selection):");
        meats = new ArrayList<Meats>();
        continueOrder = true;
        index = 0;
        while (continueOrder) {
            meats.add(new Meats(scnr));
            sandwichCost += meats.get(index).getPrice();
            index++;
            if (meats.get(meats.size() - 1).getName().equals("")) {
                meats.remove(meats.size() - 1);
                continueOrder = false;
            }
        }

        Debug.bread(bread);
        Debug.vegetables(vegetables);
        Debug.meats(meats);
        Debug.sandwichCost(sandwichCost);
    }

    public double getSandwichCost() {
        return sandwichCost;
    }
}
