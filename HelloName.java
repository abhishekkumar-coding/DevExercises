import java.util.Scanner;

public class HelloName {

    public static void greetingMessage() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your good Name: ");
        String name = sc.nextLine();

        // Remove all spaces from the middle of the string
        String cleanedName = name.replace(" ", "");

        if (cleanedName.length() != 0) {
            System.out.println("Good Morning " + cleanedName);
        } else {
            System.out.println("No valid name entered.");
        }

        // Close the Scanner to avoid resource leaks
        sc.close();
    }

    public static void main(String[] args) {
        greetingMessage();
    }
}
