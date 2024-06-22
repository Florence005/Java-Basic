package FunctionFlow;

import java.util.Scanner;

public class negativeHarmonicSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            //Check if the term index is odd or even
            if (i % 2 == 0) {
                //Even term: subtract
                sum -= 1.0 / i;
                System.out.print("+");
            } if  (i % 2 != 0 && i < n){
                //Odd term: add
                sum += 1.0/i;
                System.out.print("-");
            }
        }
        System.out.println("\nSum of harmonic series : " + sum);
    }
}
