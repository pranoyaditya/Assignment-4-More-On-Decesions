import java.util.Scanner;

public class Find_Max {
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers:");
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        int max=Math.max(first,Math.max(second,third));
        System.out.println(max);
    }
}
