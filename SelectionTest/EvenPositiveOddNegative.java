package SelectionTest;
import java.util.*;
public class EvenPositiveOddNegative {

    public static void main(String[] args) {

        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        n = sc.nextInt();
        if (n % 2 == 0 && n > 0) {
            System.out.println(n + " is even positive !");
        }else if (n % 2 != 0 && n > 0 ){
            System.out.println(n + " is odd positive!");
        }else if (n % 2 !=0 && n < 0) {
            System.out.println(n + " is even negative!");
        }else {
            System.out.println(n + " is odd negative!");
        }
    }
}
