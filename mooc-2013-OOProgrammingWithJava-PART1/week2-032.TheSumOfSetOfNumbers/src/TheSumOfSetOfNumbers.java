
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int iteration = 0;

        while (iteration < limit) {
            iteration = iteration + 1;
            sum = sum + iteration;
        }

        System.out.print("Sum is " + sum);
    }
}
