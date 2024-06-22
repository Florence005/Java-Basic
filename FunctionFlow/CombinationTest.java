package FunctionFlow;

import java.util.Scanner;

public class CombinationTest {
    public static int fact (int x){
        int ans = 1;
        for (int i = x; i >= 1 ; i--)
        {
            ans *=i;
        }
        return ans;
    }
    public static int combination(int n, int r)
    {
        return fact(n)/(fact(r)* fact(n-r));
    }
    public static void main (String args[])
    {
        int n,r,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for n and r : ");
        n = sc.nextInt();
        r = sc.nextInt();
        c = combination(n,r);
        System.out.print(c+ " combinations");
    }
}
