import java.util.Arrays;
import java.util.Scanner;

public class lexicographically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three strings:");
        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.next();
        }
        Arrays.sort(strings);

        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}
