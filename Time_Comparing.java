import java.util.Scanner;

public class Time_Comparing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give Frist time:");
        int hour1=sc.nextInt();
        int minute1=sc.nextInt();
        System.out.println("Give second time:");
        int hour2= sc.nextInt();
        int minute2=sc.nextInt();
        if(hour1<hour2)
        {
            System.out.println("Time 1 come first.");
        } else if (hour1==hour2) {
            if(minute1<minute2)
            {
                System.out.println("Time 1 come first.");
            } else if (minute1==minute2) {
                System.out.println("Time are same.");
            } else
            {
                System.out.println("Time 2 come first.");
            }
        }
        else {
            System.out.println("Time 2 come first.");
        }
    }
}
