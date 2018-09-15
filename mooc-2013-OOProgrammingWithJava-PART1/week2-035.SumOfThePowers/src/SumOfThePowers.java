
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        int iteration = 0;
        int sum = (int)Math.pow(2, iteration);

        while (iteration <= number) {
            sum += sum;
            iteration++;
        }

        sum--;

        System.out.print("Sum is " + sum);

    }
}
