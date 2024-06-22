package SelectionTest;

import java.util.Scanner;

public class dateMonthYear {
    public static void main(String[] args) {
        int date, month, year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date : ");
        date = sc.nextInt();
        System.out.println("Enter the month : ");
        month = sc.nextInt();
        System.out.println("Enter the year : ");
        year = sc.nextInt();

        if (month < 1 || month > 12 || date < 1 || date > 31) {
            System.out.println("It is an invalid month ");
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(month + " month is a leap year. ");
            }
            if (date == 29) {
                System.out.println("Valid.");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (date < 30) {
                System.out.println("Valid.");
            } else {
                System.out.println("Invalid.");
            }
        } else {
            System.out.println("have 31 days.");
            if (date <= 31) {
                System.out.println("Valid.");
            } else {
                System.out.println("Invalid.");
            }
        }
    }
}
