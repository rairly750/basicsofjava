package basicsofjava;
import java.util.Scanner;
public class sideoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();

        if (a+b>c && b+c>a &&a+c>b){
            System.out.println("these three side can make a triangle");

        }
        else{
            System.out.println("these three side can not  make a triangle");
        }
    }
}
