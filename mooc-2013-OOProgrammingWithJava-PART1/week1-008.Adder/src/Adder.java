
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user

        System.out.println("Type a number: ");
        int numberFirst = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        int numberSecond = Integer.parseInt(reader.nextLine());

        int sum = numberFirst + numberSecond;

        System.out.println("Sum of the numbers: " + sum);
    }
}
