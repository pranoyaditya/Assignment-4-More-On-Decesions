import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        System.out.println("Enter your Salary:");
        Scanner sc=new Scanner(System.in);
        long salary=sc.nextLong();
        double Tax;
        if(salary<350000)
        {
            System.out.println("Tax= 0.0");
        } else if (salary<=450000) {
            Tax=(salary-350000)*(5.0/100);
            System.out.println("Tax= "+Tax);
        }else if (salary<=750000) {
            Tax=((salary-450000)*(10.0/100))+(100000*0.05);
            System.out.println("Tax= "+Tax);
        }else if (salary<=1150000) {
            Tax=((salary-750000)*(15.0/100))+(100000*0.05)+(30000);
            System.out.println("Tax= "+Tax);
        }else if (salary<=1650000) {
            Tax=((salary-1150000)*(20.0/100))+(100000*0.05)+(30000)+(60000);
            System.out.println("Tax= "+Tax);
        }else {
            Tax = ((salary - 1650000) * (25.0 / 100)) + (100000 * 0.05) + (30000) + (60000) + (125000);
            System.out.println("Tax= " + Tax);
        }
    }
}
