
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type number: ");
            double number = Double.parseDouble(reader.nextLine());

            if (!(number < -30 || number > 40)) {
                Graph.addNumber(number);
            }
        }
    }
}
