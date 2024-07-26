import java.util.Scanner;

public class evenOrOdd {
    public static void numCheck() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is Even!");
        } else {
            System.out.println("The Number is Odd!");
        }
    }

    public static void main(String[] args) {
        numCheck();
    }
}
