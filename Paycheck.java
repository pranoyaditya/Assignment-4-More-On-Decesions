import java.util.Scanner;

public class Paycheck {
    private String name;
    private double hourlyWage;

    public Paycheck(String name, double hourlyWage) {
        this.name = name;
        this.hourlyWage = hourlyWage;
    }

    public double calculatePay(double hoursWorked) {
        double regularPay;
        double overtimePay = 0.0;

        if (hoursWorked > 40) {
            regularPay = 40 * hourlyWage;
            overtimePay = (hoursWorked - 40) * hourlyWage * 1.5;
        } else {
            regularPay = hoursWorked * hourlyWage;
        }

        return regularPay + overtimePay;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee's name:");
        String name = scanner.nextLine();

        System.out.println("Enter employee's hourly wage:");
        double hourlyWage = scanner.nextDouble();

        System.out.println("Enter number of hours worked in the past week:");
        double hoursWorked = scanner.nextDouble();

        Paycheck paycheck = new Paycheck(name, hourlyWage);
        double pay = paycheck.calculatePay(hoursWorked);

        System.out.println("\nPaycheck for " + name);
        System.out.printf("Regular Pay: $%.2f%n", pay - (pay * 0.5));
        System.out.printf("Overtime Pay: $%.2f%n", pay * 0.5);
        System.out.println("Total Pay: $" + pay);

        scanner.close();
    }
}
