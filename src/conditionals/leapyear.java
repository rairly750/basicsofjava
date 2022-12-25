package conditionals;
import java.util.Random;
import java.util.Scanner;
public class leapyear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        if(n%100==0 && n%400==0 || n%100!=0 && n%4==0) {  //

            System.out.println("leap year");
        }
        else {  //
            System.out.println("not leap year");

        }
    }
}
