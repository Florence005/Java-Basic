package SatJavaClass;

import java.util.*;
public class ASampleJavaProgram {
    public static void main(String[] args) {

        int n1;

        System.out.println("Hello, World!");
        System.out.println("How are you?");
        System.out.println("How many meals do you have a day?");

        Scanner lunch =new Scanner(System.in);
        n1 = lunch.nextInt();

        System.out.println("I have " + n1 + "meals a day!");
    }
}
