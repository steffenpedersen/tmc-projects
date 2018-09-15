
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.

        System.out.print("Type a number: ");
        int numberFirst = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int numberSecond = Integer.parseInt(reader.nextLine());

        double sum = (double)numberFirst / numberSecond;

        System.out.println("Division: " + numberFirst + " / " + numberSecond + " = " + sum);
    }
}
