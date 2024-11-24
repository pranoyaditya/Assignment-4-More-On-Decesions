import java.util.Scanner;

public class Month {
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month (1 for January, 2 for February, etc.):");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            int days = getLength(month);
            System.out.println(days + " days");
        } else {
            System.out.println("Invalid month input.");
        }

        scanner.close();
    }

    public static int getLength(int month) {
        return DAYS_IN_MONTH[month - 1];
    }
}
