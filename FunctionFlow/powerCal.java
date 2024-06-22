package FunctionFlow;

import java.util.Scanner;

public class powerCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int b = sc.nextInt();
        int p = sc.nextInt();
        int a = calculatePower.calPower(b,p);

        System.out.print("Base "+ b + " and "+ " Power "+  p + " = " + a);
    }
}
