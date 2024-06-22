package SelectionTest;

import java.util.Scanner;

public class palindromeCalculation {
    public static void main(String[] args) {

        int fd,sd,td,fod, num;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 4 digit numbers : ");
        num = sc.nextInt();
        fd = num / 1000;
        sd = num %1000 / 100;
        td = num % 100 / 10;
        fod = num %10;

        if ((fd == fod) && (sd == td)) {
            System.out.println ("This is a palindrome number!");
        }
        else {
            System.out.println("This is not a palindrome number!");
        }


    }
}
