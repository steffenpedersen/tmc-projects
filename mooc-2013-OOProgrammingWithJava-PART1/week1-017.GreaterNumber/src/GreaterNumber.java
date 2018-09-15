import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int numberFirst = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        int numberSecond = Integer.parseInt(reader.nextLine());

        if (numberFirst == numberSecond) {
            System.out.println("The numbers are equal!");
        } else if (Math.max(numberFirst, numberSecond) == numberFirst) {
            System.out.println("Greater number: " + numberFirst);
        } else if (Math.max(numberFirst, numberSecond) == numberSecond) {
            System.out.println("Greater number: " + numberSecond);
        }
    }
}
