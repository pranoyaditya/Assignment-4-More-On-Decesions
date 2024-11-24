import java.util.Scanner;

public class Compass_Position {
    public static void main(String[] args) {
        System.out.println("Enter Degree positon of compass:");
        Scanner sc=new Scanner(System.in);
        int Degree=sc.nextInt();
        if(Degree>=0&&Degree<23){
            System.out.println("N");
        } else if (Degree>22 && Degree<68) {
            System.out.println("NE");
        } else if (Degree>67&&Degree<113) {
            System.out.println("E");
        } else if (Degree>112&&Degree<158) {
            System.out.println("SE");
        } else if (Degree>157&&Degree<203) {
            System.out.println("S");
        } else if (Degree>202&&Degree<248) {
            System.out.println("SW");
        } else if (Degree>247&&Degree<293) {
            System.out.println("W");
        } else if (Degree>336&&Degree<361) {
            System.out.println("N");
        }else {
            System.out.println("NW");
        }
        sc.close();
        }
    }
