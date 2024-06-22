package SelectionTest;

import java.util.Scanner;

public class nonDecreasingNumber {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1 number : ");
        n1 = sc.nextInt();
        System.out.println("Enter n2 number : ");
        n2 = sc.nextInt();
        System.out.println("Enter n3 number : ");
        n3 = sc.nextInt();

        if ((n1 <= n2) && (n1 <= n3)) {
            if (n2 <= n3) {
                System.out.println("The integer in non-decreasing order : " + n1 + "," + n2 + "," + n3);
            } else {
                System.out.println("The integer in non-decreasing order : " + n1 + "," + n3 + "," + n2);
            }
        } else if ((n2 <= n1) && (n2 <= n3)) {
            if (n1 <= n3) {
                System.out.println("The integer in non-decreasing order : " + n2 + "," + n1 + "," + n3);
            } else {
                System.out.println("The integer in non-decreasing order : " + n2 + "," + n3 + "," + n1);
            }
        } else {
            if (n1 <= n2) {
                System.out.println("The integer in non-decreasing order : " + n3 + "," + n1 + "," + n2);
            } else {
                System.out.println("The integer in non-decreasing order : " + n3 + "," + n2 + "," + n1);
            }
        }
    }
}


