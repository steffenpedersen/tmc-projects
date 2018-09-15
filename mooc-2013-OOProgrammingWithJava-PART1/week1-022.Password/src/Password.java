
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";

        while (true) {
            System.out.print("Type the password: ");
            String type = reader.nextLine();

            if (type.equals(password)) {
                System.out.println("Right!");
                System.out.println("Secret?");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
