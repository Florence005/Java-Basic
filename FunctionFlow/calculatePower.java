package FunctionFlow;

public class calculatePower {
    public static int calPower(int b , int p){
        double ans = Math.pow(b,p);
        return (int) ans; //cast the double result to an int
    }

    public static void main(String[] args) {
        int res = calPower(2,3);
        System.out.println(res);
    }
}
