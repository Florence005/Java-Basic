package SelectionTest;

import java.util.Scanner;

public class calculateInterest {
    public static void main(String[] args) {

        String type;
        int amt, period ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your account type : ");
        type = sc.nextLine();
        System.out.println("Enter the loan amount :");
        amt = sc.nextInt();
        System.out.println("Enter the loan period : ");
        period = sc.nextInt();

        if (type.equals("Normal"))
        {
            if (period < 5 ) {
                System.out.println("The interest of the account is " + "$" + (amt*0.15)*period );
            }
            else
            {
                System.out.println("The interest of the account is " + "$" +(amt*0.17)*period );
            }
        }
        else if (type.equals("Deluxe")) {
            if (period < 10) {
                System.out.println("The interest of the account is " + "$" +(amt * 0.14) * period);
            } else if (period <= 10 || period <= 15) {
                System.out.println("The interest of the account is " + "$" +(amt * 0.16) * period);
            } else {
                if (period > 15) {
                    System.out.println("The interest of the account is " + "$" +(amt * 0.18) * period);
                }
            }
        }
        else
        {
            System.out.println("The interest of the account is " + (amt*0.18)*period );
        }
    }
}
