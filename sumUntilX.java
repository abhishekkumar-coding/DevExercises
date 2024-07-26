import java.util.Scanner;

public class sumUntilX {
    public static void main(String[] args) {
        int result = sum();
        System.out.println("The sum of al Numbers :" + result);
    }

    public static int sum() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter numbers to sum. Type 'x' to finish.");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            }
            int number = Integer.parseInt(input);
            sum += number;
        }
        return sum;

    }

}