package basicsofjava;
import java.util.Scanner;
public class greaterinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number");
        int a =sc.nextInt();
        System.out.println("enter a second number");
        int b =sc.nextInt();
        System.out.println("enter a third number");
        int c =sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is greater than from other");

        }
        else if (b>a && b>c){
            System.out.println("b is greater than from other");
        }
        else {
            System.out.println(" c is greater");

        }
    }
}
