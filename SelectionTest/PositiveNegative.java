package SelectionTest;
import java.util.*;
public class PositiveNegative {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        if (num >= 0) {
            System.out.println("Your number is positive!");
        } else {
            System.out.println("Your number is negative!");
        }
    }
}
