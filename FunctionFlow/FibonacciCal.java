package FunctionFlow;

import java.util.Scanner;

public class FibonacciCal {
    public static void fibonacci(int fn, int sn, int gn)
    {
        int n = 0;
        while (n < gn) {
            n = fn + sn;
            if (n < gn) {
                System.out.print(" " + n);
            }
            fn = sn;
            sn = n;
        }
        System.out.print(" are the fibonacci series of the given numbers.");
    }
     public static void main (String args[])
        {
            int fn, sn,gn;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number : ");
            fn = sc.nextInt();
            System.out.println("Enter second number : ");
            sn = sc.nextInt();
            System.out.println("Enter greatest number : ");
            gn = sc.nextInt();

     fibonacci(fn, sn , gn);
        }
    }


