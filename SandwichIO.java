import java.io.FileWriter;
import java.io.IOException;

public class SandwichIO {
    public static void writeOrderToFile(Order order) {
        try {
            FileWriter writer = new FileWriter("/Users/btseng/Desktop/CS1400FinalProject/orderline.txt", true);
            writer.write(order.getContent());
            writer.write(System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
