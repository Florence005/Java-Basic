package SelectionTest;
import java.util.*;
public class SalePerson {

    public static void main(String[] args) {

        String name;
        float sale, commission;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sale person's name : ");
        name = sc.nextLine();

        System.out.println("Enter the sales for the month : ");
        sale = sc.nextFloat();

        System.out.println("Enter the commissions rate in percentage : ");
        commission = sc.nextFloat();

        float newCommission = sale * (commission/100);
        System.out.println("Commissions for" + name + "is : $ " + newCommission );

        if (sale >= 1.00 && sale <= 1000.00) {
            newCommission += (sale * (2/100));
            System.out.println("Additional 2% commission applied. Total commission : $" + newCommission);
        }else if (sale >= 1001.00 && sale <= 5000.00) {
            newCommission += (sale * (5/100));
            System.out.println("Additional 5% commission applied. Total commission : $" + newCommission);
        }else if (sale >= 5000.00) {
            newCommission += (sale * (10 / 100));
            System.out.println("Total commission of the sale : $" + newCommission);
        }else {
            System.out.println("No additional commission applied. Total commission : $" + newCommission);
        }

    }
}
