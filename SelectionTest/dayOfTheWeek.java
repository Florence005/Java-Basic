package SelectionTest;

import java.util.Scanner;

public class dayOfTheWeek {
    public static void main(String[] args) {

        int dDay, elapsedDay, futureDay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's day (0 for Monday, 1 for Tuesday, 2 for Wednesday, 3 for Thursday, 4 for Friday, 5 for Saturday, 6 for Sunday");
        dDay = sc.nextInt();
        System.out.println("Enter number of days elapsed: ");
        elapsedDay = sc.nextInt();

        futureDay = (dDay + elapsedDay)% 7;
        String [] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dDay >= 0 && dDay <= 6)
        {
            System.out.println("Today is " + dayOfWeek[dDay] + " and the future day is " + dayOfWeek[futureDay]);
        }
        else
        {
            System.out.println("Enter a valid day!");
        }




    }
}
