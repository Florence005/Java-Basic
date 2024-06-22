package SelectionTest;
import java.util.*;
public class Scores {
    public static void main(String[] args) {

        float mya, eng, math;
        Scanner scores = new Scanner(System.in);
        System.out.println("Enter scores of mya, eng, and math :");
        mya = scores.nextFloat();
        eng = scores.nextFloat();
        math = scores.nextFloat();
        if (mya >= 40 && eng >= 40 && math >= 40) {
            System.out.println("You passed all exam !");
        } else {
            System.out.println("You failed the exam !");
        }
    }
}
