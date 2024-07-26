import java.util.Scanner;

public class SimpleInterestCalculator {
    public static float calculateSimpleIntereset() {
        Scanner sc = new Scanner(System.in);

        float p;
        int t;
        Float r;

        System.out.println("Enter Principle : ");
        p = sc.nextFloat();
        System.out.println("Enter time : ");
        t = sc.nextInt();
        System.out.println("Enter rate");
        r = sc.nextFloat();

        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        float si = calculateSimpleIntereset();
        System.out.println(si);
    }
}
