
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here

        System.out.print("How old are you? ");
        int number = Integer.parseInt(reader.nextLine());

        if (number >= 18) {
            System.out.println("You have reached the age of majority!\n");
        } else {
            System.out.println("You have not reached the age of majority yet!");
        }
    }
}
