package SatJavaClass;

import java.util.*;
/**
 * Testing
 * @version 1.0
 * @author PersoanA
 * */
public class Case {


    public static void main(String[] args) {

        int age;
        String Richard;
        System.out.println("Enter age: ");
        Scanner sc = new Scanner (System.in);
        age = sc.nextInt();

        checkConditions(age);

    }

    /**
     * This is checking condition class
     * @param integer age
     * @return void calculate the age limit
     */
    private static void checkConditions(int age) {

        switch (age) {
            case 25:
                System.out.println("He is too young!");
                break;
            case 30:
                System.out.println("Not in my expectation.");
                break;
            case 35:
                System.out.println("Too old !!!!");
                break;
            default:
                System.out.println("nth to say!!");
                break;
        }
    }
}
