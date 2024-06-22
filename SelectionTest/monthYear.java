package SelectionTest;

import java.util.Scanner;

public class monthYear {
    public static void main(String[] args) {
        int m , y ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month : ");
        m = sc.nextInt();
        System.out.println("Enter a year :");
        y = sc.nextInt();

        if (m < 1 || m > 12 ) {
            System.out.println("The number of days in the month " +m+ "/" +y);
        }
        else if (m == 2) {
            if ((y % 4 == 0 && y % 100 != 0 || y % 400 == 0)) {
                System.out.println("The number of days in the month " + m + "/" + y + " had 29 days.");
            } else {
                System.out.println("The number of days in the month " + m + "/" + y + " had 28 days.");
            }
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11){
            System.out.println("The number of days in the month " + m + "/" + y + " had 30 days.");
        }
        else {
            System.out.println("The number of days in the month " + m + "/" + y + " had 31 days.");
        }
    }
}
