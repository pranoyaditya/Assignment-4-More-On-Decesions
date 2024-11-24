import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a single character from the alphabet:");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char ch = input.charAt(0);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error: Not a letter.");
            }
        } else {
            System.out.println("Error: Input should be a single character.");
        }

        scanner.close();
    }
}
