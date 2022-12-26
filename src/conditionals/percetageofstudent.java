package conditionals;
import java.util.Scanner;
public class percetageofstudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter percentage");
        int n =sc.nextInt(); // n = %
        if (n >= 90) {

            System.out.println("excellent ");
        }

        else if(n>=80){
            System.out.println("very good");
        } else if (n>=70) {
            System.out.println("good");

        }
        else if (n>=60){
            System.out.println("can do it better");
        }
        else{
            System.out.println("fail");
        }
    }
}
