package FunctionFlow;

import java.util.Scanner;

public class binaryToDecimal {
    public static int biDec(int binary)
    {
        int decimal = 0;
        int power = 0;
        while ( binary > 0)
        {
            int lastDigit = binary % 10; // Get last digit of the binary number
            decimal += lastDigit * (int) Math.pow(2, power); //Convert to decimal and add to the sum
            binary /=10; //Remove last digit from the binary number
            power++;
        }
        return decimal;
    }

    public static void main (String args [])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter binary number : ");
        int binary = sc.nextInt();

        int decimal = biDec(binary); //Convert binary to decimal
        System.out.println("Decimal equivalent : " + decimal); //Print the result
    }
}
