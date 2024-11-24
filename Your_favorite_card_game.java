import java.util.Scanner;

public class Your_favorite_card_game {
    public static void main(String[] args) {
        System.out.println("Enter your favorite card:");
        Scanner sc=new Scanner(System.in);
        String card=sc.nextLine();
        char first=card.charAt(0);
        char second=card.charAt(1);
        if(first=='A'){
            System.out.print("Ace");
        }else if(first=='J'){
            System.out.print("Jack");
        }else if(first=='K'){
            System.out.print("King");
        }else if(first=='H'){
            System.out.print("Hearts");
        }else if(first=='D'){
            System.out.print("Diamonds");
        }else if(first=='S'){
            System.out.print("Spades");
        }else if(first=='C'){
            System.out.print("Spades");
        }else if(first=='Q'){
            System.out.print("Queen");
        }else{
            System.out.print(first);
        }
        System.out.print(" of ");
        if(second=='A'){
            System.out.print("Ace");
        }else if(second=='J'){
            System.out.print("Jack");
        }else if(second=='K'){
            System.out.print("King");
        }else if(second=='H'){
            System.out.print("Hearts");
        }else if(second=='D'){
            System.out.print("Diamonds");
        }else if(second=='S'){
            System.out.print("Spades");
        }else if(second=='C'){
            System.out.print("Spades");
        }else if(second=='Q'){
            System.out.print("Queen");
        }else{
            System.out.print(first);
        }
    }
}
