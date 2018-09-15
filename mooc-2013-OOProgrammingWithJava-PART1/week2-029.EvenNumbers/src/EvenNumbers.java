
public class EvenNumbers {

    public static void main(String[] args) {

        int number = 1;

        while (number <= 100) {

            number = number + 1;
            int check = number%2;

            if (check == 0) {
                System.out.println(number);
            }
        }

    }
}
