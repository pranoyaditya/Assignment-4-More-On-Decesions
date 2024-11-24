import java.util.Scanner;

public class getNumericGrade {
    public static void main(String[] args) {
        System.out.println("Enter the grade:");
        Scanner sc=new Scanner(System.in);
        String grade=sc.nextLine();
        char first=grade.charAt(0);
        int size=grade.length();
        char second='*';
        if(size>1)
        {
            second=grade.charAt(1);
        }
        if(first=='A')
        {
            if(size==1){
                System.out.println(4);
            }
            else {
                if(second=='+') System.out.println(4);
                else System.out.println(3.7);
            }
        }else if(first=='B')
        {
            if(size==1){
                System.out.println(3);
            }
            else {
                if(second=='+') System.out.println(3.3);
                else System.out.println(2.7);
            }
        }else if(first=='C')
        {
            if(size==1){
                System.out.println(2);}
            else {
                if(second=='+') System.out.println(2.3);
                else System.out.println(1.7);
            }
        }else if(first=='D')
        {
            if(size==1){
                System.out.println(1);}
            else {
                if(second=='+') System.out.println(1.3);
                else System.out.println(0.7);
            }
        }else
        {
            System.out.println(0);
        }
    }
}
