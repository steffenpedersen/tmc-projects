
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        // Write your program here
        // Use only variables sum and read

        System.out.print("Type a number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += sum + read;

        System.out.print("Type another number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.print("Type another another number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Sum: " + sum);
    }
}
