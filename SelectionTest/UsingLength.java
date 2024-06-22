package SelectionTest;
import java.util.*;
public class UsingLength {

    public static void main(String[] args) {

        String s1, s2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one words :");
        s1 = sc.nextLine();
        System.out.println("Enter another words :");
        s2 = sc.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Great - the same !");
        }else if (s1.compareToIgnoreCase(s2) ==0) {
            System.out.println("Okay - Almost the same!");
        }else if (s1.length() == s2.length()) {
            System.out.println("They are the same !");
        } else {
            System.out.println("Totally different!");
        }
    }
}
