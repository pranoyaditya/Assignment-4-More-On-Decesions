import java.util.Scanner;

public class geteAlphaGrade {
    public static void main(String[] args) {
        System.out.println("Enter the grade:");
        Scanner sc=new Scanner(System.in);
        double grade=sc.nextDouble();
        if(grade<=4&&grade>=3.50)
        {
            System.out.println('A');
        }else if(grade<=3.49&&grade>=2.50)
        {
            System.out.println('B');
        }else if(grade<=2.49&&grade>=1.50)
        {
            System.out.println('C');
        }else if(grade<=1.49&&grade>=0.50)
        {
            System.out.println('D');
        }else
        {
            System.out.println('F');
        }
    }
}
