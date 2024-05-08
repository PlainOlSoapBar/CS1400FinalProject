import java.io.FileWriter;
import java.io.IOException;

public class SandwichIO {
    public static void writeOrderToFile(Order order) {
        try {
            FileWriter writer = new FileWriter("PATH TO orderline.txt", true);
            writer.write(order.getContent());
            writer.write(System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
