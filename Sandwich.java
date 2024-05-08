import java.util.ArrayList;
import java.util.Scanner;

public class Sandwich {
    private Scanner scnr = new Scanner(System.in);
    private Bread bread = new Bread(scnr);
    private ArrayList<String[]> vegetables;
    private ArrayList<String[]> meats;
    private double sandwichCost;

    // Constructor
    public Sandwich() {
        sandwichCost = bread.getPrice();
        Debug.bread(bread);
    }
}
