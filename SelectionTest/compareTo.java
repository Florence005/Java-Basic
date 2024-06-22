package SelectionTest;

import java.util.Scanner;

public class compareTo {
    public static void main(String[] args) {
        String s1, s2 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter words for s1 : ");
        s1 = sc.nextLine();
        System.out.println("Please enter words for s2 : ");
        s2 = sc.nextLine();

        if (s1.compareTo(s2) == 0)
        {
            System.out.println("Great - the same " + s1 + s2);
        }
        else if (s1.compareToIgnoreCase(s2) == 0)
        {
            System.out.println("Okay-almost the same " + s1 + s2);
        }
        else
        {
            if (s1.length() == s2.length())
            {
                System.out.println("They are the same length.");
            }
            else
            {
                System.out.println("The words are neither the same nor of the same length.");
            }
        }
    }
}
