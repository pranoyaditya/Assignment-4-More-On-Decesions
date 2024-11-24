import java.util.Scanner;

public class Same_up_two_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two floating-point numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        if (Math.abs(num1 - num2) < 0.01) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }

        sc.close();
    }
}
