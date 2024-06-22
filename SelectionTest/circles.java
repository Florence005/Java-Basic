package SelectionTest;

import java.util.Scanner;

public class circles {
    public static void main(String[] args) {
        float x1,y1,r1, x2,y2,r2;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x1 , y1, and r1 numbers : ");
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        r1 = sc.nextFloat();
        System.out.println("Enter x2, y2, and r2 numbers : ");
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        r2 = sc.nextFloat();

        float d = (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2);

        if (d < r1 - r2)
        {
            System.out.println("One circle is inside the other without touching.");
        }
        else if (d == r1+r2)
        {
            System.out.println("Circles touch externally.");
        }
        else if ((r1-r2 < d &&  r1 +r2 > d))
        {
            System.out.println("Circles are overlapping.");
        }
        else
        {
            System.out.println("Circles are not overlap or touching.");
        }




    }
}
