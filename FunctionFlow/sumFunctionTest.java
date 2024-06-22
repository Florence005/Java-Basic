//modifier returnType funName(parameters)
package FunctionFlow;

public class sumFunctionTest {
    public static int sum(int n1, int n2) {
        int ans = n1 + n2; //assign a variable to get sum of two n for ans:
        return ans; //return variable data type eg:byte, short, int , long
    }

    public static void main(String[] args) {
        int res = sum(2,5);
        System.out.print(res);

    }
}
