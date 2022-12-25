package conditionals;
import java.util.Random;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        if(n%2==0) {  //n is even

            System.out.println("The number you entr is even");
        }
        else {  // n is odd
            System.out.println("The number you enter is odd");

        }
    }
}
