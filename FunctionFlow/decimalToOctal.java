package FunctionFlow;

import java.util.Scanner;

public class decimalToOctal {
    public static String deciOct(int decimal)
    {
        if(decimal == 0){
            return "0";
        }
        String octal = "";
        while (decimal > 0){
            octal = (decimal % 8) + octal;
            int lastDigit = decimal % 10;
            decimal /= 8;
        }
        return octal;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number : ");
        int decimal = sc.nextInt();
        sc.close();

        String octal = deciOct(decimal); //convert decimal to octal
        System.out.println("Octal equivalent : " + octal);
    }
}
