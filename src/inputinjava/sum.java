package inputinjava;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number :");
        int x = sc.nextInt();
        System.out.println("enter 2nd umber:");
        int y = sc.nextInt();
        int sum= x+y;
        System.out.println(sum);

    }
}
