import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 1;
        int iteration = 1;

        while (iteration <= number) {
            sum *= iteration;
            iteration++;
        }

        System.out.print("Sum is " + sum);
    }
}
