package inputinjava;
import java.util.Scanner;
public class findremainder {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter divident :");
        int a = sc.nextInt();
        System.out.println("enter divisor :");
        int b = sc.nextInt();
        int q = a/b;
        double r = a-(b*q);
        System.out.println("the remainder when"+a+" is divided by "+b+" is " +r);
    }
}
