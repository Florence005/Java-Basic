package SatJavaClass;

import java.util.Scanner;

public class GiftCert {
    public static void main(String[] args) {
        double amountRemaining = 100.00;
        double totalSpent = 0.00;
        int itemNumber = 0;
        int maxItem =3;
        Scanner keyboard = new Scanner(System.in);

        while (amountRemaining > 0 && (itemNumber <= 3)) {
            System.out.println("Amount of money left:" + amountRemaining + " and number of items that can be bought:" + (maxItem - itemNumber));

            double price = keyboard.nextDouble();
            if (price <= amountRemaining) {
                System.out.println("Congratulation! you can buy it.");
                totalSpent = totalSpent + price;
                amountRemaining = amountRemaining - price;
                //amountRemaining = amountRemaining - totalSpent;
                if (amountRemaining > 0) {
                    System.out.println("Amount of money left." + amountRemaining);
                    itemNumber++;
                } else {
                    System.out.println("No more money.");
                    break;
                }
            } else {
                System.out.println("item is too expensive");
            }
        }
        System.out.println("You are not eligiable to buy more.");
            System.out.println("Amount of money spent" + totalSpent+ " and farewell message.");
            System.exit(0);

    }
}




