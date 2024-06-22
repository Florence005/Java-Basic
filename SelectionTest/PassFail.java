package SelectionTest;
import java.util.*;
public class PassFail {
    public static void main(String[] args) {

        int mark;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark :");
        mark = sc.nextInt();
        if(mark >= 40) {
            System.out.println("You passed the exam!");
        } else {
            System.out.println("You failed the exam!");
        }
    }
}
