
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user

        System.out.print("Type a number: ");
        int numberFirst = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int numberSecond = Integer.parseInt(reader.nextLine());

        int sum = Math.max(numberFirst, numberSecond);

        System.out.println("The bigger number of the two numbers given was: " + sum);
    }
}
