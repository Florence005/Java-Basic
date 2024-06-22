package FunctionFlow;

import java.util.Scanner;

public class DecimalToBinary {
    public static String decBi(int decimal){
        if (decimal == 0){
            return "0";
        }
        String binary = "";
        while ( decimal > 0)
        {
            binary = (decimal % 2) + binary; // Concatenate the remainder in front of the binary String
            int lastDigit = decimal % 10; // Get last digit of the binary number
            decimal /=2; //Divide the decimal number by 2
        }
        return binary;
    }

    public static void main (String args [])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter decimal number : ");
        int decimal = sc.nextInt();
        sc.close();

        String binary = decBi(decimal); //Convert decimal to binary
        System.out.println("Binary equivalent : " + binary); //Print the result
    }
}
