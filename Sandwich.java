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
        System.out.println("Please select a bread [1,4]:");
        bread = new Bread(scnr);
        sandwichCost += bread.getPrice();

        // Order vegetables
        Menu.showVegetablesMenu();
        System.out.println("\nPlease select a vegetable [1,8] (Enter 8 to quit vegetable selection):");
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
        System.out.println("\nPlease select a meat [1,5] (Enter 5 to quit meat selection):");
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

        // Comment out if not in use
        // Debug.bread(bread);
        // Debug.vegetables(vegetables);
        // Debug.meats(meats);
        // Debug.sandwichCost(sandwichCost);
    }

    // Get bread name
    public String getBreadName() {
        return bread.getName();
    }

    // Get vegetables names
    public String getVegetablesNames() {
        String str = " ";
        for (int i = 0; i < vegetables.size(); i++) {
            str += vegetables.get(i).getName();
            if (i < vegetables.size() - 1) {
                str += ", ";
            }
        }
        return str;
    }

    // Get meats names
    public String getMeatsNames() {
        String str = " ";
        for (int i = 0; i < meats.size(); i++) {
            str += meats.get(i).getName();
            if (i < meats.size() - 1) {
                str += ", ";
            }
        }
        return str;
    }

    // Returns a string with the sandwich contents
    public String getContent() {
        return (getBreadName() + " Bread" + getVegetablesNames() + getMeatsNames()).trim().replaceAll(" +", " ");
    }

    public double getSandwichCost() {
        return sandwichCost;
    }
}
