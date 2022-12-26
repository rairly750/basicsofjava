package basicsofjava;
import java.util.Scanner;
public class divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n =sc.nextInt();
        if(n%5==0 && n%3 ==0){ // or n%15 //or if the number is divisible by 5
          //  and not divisble by 3 then
            // use n%5 ==0 && n %3 != 0;
            System.out.println("tne number is divisible by 5 and 3");
        }
        else{
            System.out.println("tne number is not divisible by 5 and 3");
        }
    }
}
