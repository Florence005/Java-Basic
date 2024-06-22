package SelectionTest;

import java.util.Scanner;

public class profitForSellingItem {
    public static void main(String[] args) {
        String type;
        float price;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the item : ");
        type = sc.nextLine();
        System.out.println("Enter the price : ");
        price = sc.nextFloat();

        if (type.equals("clothe")) {
            if (price < 20 ) {
                System.out.println("The profit for selling an item based on the type is :"  + "$" + price*0.1);
            }
            else if (price <= 50) {
                System.out.println("The profit for selling an item based on the type is :" + "$"+ price * 0.15);
            }
            else {
                System.out.println("The profit for selling an item based on the type is :" + "$"+ price * 0.2);
            }
            }
        else if (type.equals("shoes")) {
            if (price < 5 || price > 30){
                System.out.println("The profit for selling an item based on the type is :" + "$"+ price*0.05);
            }
            else {
                System.out.println("The profit for selling an item based on the type is :" + "$"+ price*0.1);
            }
        }
        else {
            System.out.println("Wrong");
        }
    }
}
