import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        showMenu();
        int breadChoice = getBreadChoice(scnr);
        System.out.println("You selected: " + breadChoice);

        scnr.close();
    }

    public static void showMenu() {
        System.out.println("=== Select Sandwich Bread: ===\n" +
                "1. White Bread $1.50\n" +
                "2. Wheat Bread $1.60\n" +
                "3. French Bread $1.80\n" +
                "4. Organic Bread $2.00\n");
    }

    public static int getBreadChoice(Scanner scnr) {
        System.out.println("Select a bread [1,4]");
        int choice = scnr.nextInt();
        if (choice >= 1 && choice <= 4) {
            return choice;
        }
        System.out.print("Invalid selection. ");
        return getBreadChoice(scnr);
    }
}