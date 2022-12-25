package inputinjava;
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        int x = sc.nextInt();
        System.out.println("enter second number :");
        int y = sc.nextInt();
        int square = x*x;
        System.out.println(square);
        int divide = x/y;
        System.out.println(divide); //

    }
}
