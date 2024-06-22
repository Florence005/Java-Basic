package SelectionTest;

import java.util.Scanner;

public class NestedPosNeg {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        if (num < 0) {
            if (num % 2 == 0){
                System.out.println(num + " is an negative even number.");
            }
            else {
                System.out.println(num + " is an negative odd number.");
            }
        }
        else {
            if (num % 2 != 0) {
                System.out.println(num + " is a positive even number.");
            }
            else {
                System.out.println(num + " is a postive odd number.");
            }
        }
        sc.close();


    }
}
