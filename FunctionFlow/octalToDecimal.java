package FunctionFlow;

import java.util.Scanner;

public class octalToDecimal {
    public static int octalDec(int octal) {
        int decimal = 0;
        int power = 0;
        while (octal > 0) {
            int lastDigit = octal % 10; // Get last digit of the octal number
            decimal += lastDigit * (int) Math.pow(8, power); //Convert to decimal and add to the sum
            octal /= 10; //Remove last digit from the octal number
            power++;
        }
        return decimal;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number : ");
        int octal = sc.nextInt();

        int decimal = octalDec(octal); //Convert octal to decimal
        System.out.println("Decimal equivalent : " + decimal); //Print the result
    }
}
