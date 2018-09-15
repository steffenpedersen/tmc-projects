
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here

        System.out.print("Type your name: ");
        String userNameFirst = reader.nextLine();

        System.out.print("Type your age: ");
        int userAgeFirst = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String userNameSecond = reader.nextLine();

        System.out.print("Type your age: ");
        int userAgeSecond = Integer.parseInt(reader.nextLine());

        int sum = userAgeFirst + userAgeSecond;

        System.out.println(userNameFirst + " and " + userNameSecond + " are " + sum + " years old in total.");
    }
}
