package FunctionFlow;

import java.util.Scanner;

public class harmonicSeries {
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        double sum = 0.0;
        String res = "";
        for(int i = 1; i <= n ; i ++)
        {
            double ans = 1.0/i;
            sum += ans;
            res +=(i==1) ? "1" : " + 1/" + i; //checking i==1? true : false;
        }
        System.out.println(res);
        System.out.printf("Sum of Series up to %d terms: %.6f", n, sum);

    }
}
