package SelectionTest;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        if (num % 2 ==0 ) {
            if (num >= 0) {
                System.out.println(num + " is an even positive number! ");
            }
            else {
                    System.out.println(num + " is an even negative number! ");
                }
        }
        else {
            if (num >= 0) {
                System.out.println(num + " is an odd positive number !");
            }
            else {
                System.out.println(num + " is an odd negative number !");
            }

        }
    }
}
