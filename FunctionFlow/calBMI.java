package FunctionFlow;
import java.util.Scanner;
public class calBMI {
    public static float bmiTest(int w, int h){
        float wkg = w * 0.4535f;
        float hm = h * 0.0254f;
        float bmi = wkg / (hm * hm);
        return bmi;
    }

    public static void main(String[] args) {
//        float res = bmiTest(110,62);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in lb : ");
        int w = sc.nextInt();
        System.out.println("Enter your height in inches : ");
        int h = sc.nextInt();

        float res = bmiTest(w,h);
        System.out.println("Your BMI is " + res);

    }
}
