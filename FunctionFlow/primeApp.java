package FunctionFlow;

import java.util.Scanner;

public class primeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean ans = MyFirstFunctionTest.isPrime(n);
        if ( ans == true){
            System.out.println(n + " is prime number.");
        }
        else{
            System.out.println(n + " is not prime number.");
        }
    }
}
