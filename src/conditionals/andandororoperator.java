package conditionals;
import java.util.Scanner;
public class andandororoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt(); // here, n= no.
        if(n>9&& n<100){
            System.out.println("the number is two digit");
        }
        else{
            System.out.println("the number is not two digit");
        }
    }
}
