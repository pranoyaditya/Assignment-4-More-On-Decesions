import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter C for Celsius or F for Fahrenheit:");
        char scale = scanner.next().charAt(0);

        if (scale == 'F' || scale == 'f') {
            temperature = (temperature - 32) * 5 / 9;
        }

        if (temperature < 0) {
            System.out.println("Water is solid (ice) at this temperature.");
        } else if (temperature >= 100) {
            System.out.println("Water is gaseous (steam) at this temperature.");
        } else {
            System.out.println("Water is liquid at this temperature.");
        }

        scanner.close();
    }
}
