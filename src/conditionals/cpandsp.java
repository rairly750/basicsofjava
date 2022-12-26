package conditionals;
import java.util.Scanner;
import java.util.Scanner;

public class cpandsp {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        System.out.println("Enter a selling price :");
        double sp = sc.nextInt(); // sp = selling price
        System.out.println("enter a cost price :");
        double cp =sc.nextInt();  // cp = cost price
        if(sp > cp){
            System.out.println(" your profit is :");
            System.out.println(sp-cp);

        }
       if(sp<cp){
            System.out.println("yur loss is :");
           System.out.println(cp-sp);
           // or int profit =sp-cp;
        }
       if(sp==cp){
           System.out.println("no-profit-no-loss");
           System.out.println("zero");
           //or int loss = cp-sp;
       }
    }
}
