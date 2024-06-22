package FunctionFlow;

public class MyFirstFunctionTest {
    public static boolean isPrime(int n) {
        int div = 2;
        while (n % div != 0) {
            div++;
        }
        if (n == div) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean res = isPrime(5);
        if (res == true) {
            System.out.println(" 5 is prime number.");
        } else {
            System.out.println("5 is not prime number.");
        }
    }
}
