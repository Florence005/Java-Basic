package SelectionTest;

import java.util.Scanner;

public class commissionSale {
    public static void main(String[] args) {
        String name;
        float sale, commission;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name of a sale person : ");
        name = sc.nextLine();
        System.out.println("Enter total sales for the month : ");
        sale = sc.nextFloat();

        if (sale >= 1 && sale <= 1000.00)
        {
            System.out.println("Sales commissions are calculated as follows : " + "$" + sale*2/100);
        }
        else if (sale >= 1001.00 && sale <= 5000.00)
        {
            System.out.println("Sale commissions are calculated as follows : " + "$" + sale*5/100);
        }
        else
        {
            System.out.println("Sale commissions are calculated as follows : " + "$" + sale*10/100);
        }
    }
}
