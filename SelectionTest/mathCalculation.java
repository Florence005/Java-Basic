package SelectionTest;
import  java.util.*;
public class mathCalculation {
    public static void main(String[] args) {
        int a , b , c , temp;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a value of a :");
        a = sc.nextInt();
        System.out.println("Enter a value of b :");
        b = sc.nextInt();
        System.out.println("Enter a value of c :");
        c = sc.nextInt();

        temp = b * b - (4*a*c);
        int t = (int) Math.sqrt(temp);
        if (temp > 0) {
            int t1 = (-b +t) / (2*a);
            int t2 = (-b - t) / (2*a);
            System.out.println("The equation has two solution : " + t1 + "and" + t2);
        }
        else if (temp == 0) {
            int t3 = -b / (2*a);
            System.out.println("The equation has one solution :" + t3 );
        }
        else {
            System.out.println ("The equation has no solution");
        }



    }
}
