package SelectionTest;
import java.util.*;
public class DaysOfWeek {

    public static void main(String[] args) {

        int DDay, elapsedDays, futureDay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's day :");
        DDay = sc.nextInt();

        System.out.println("Enter the number of days elapsed since today :");
        elapsedDays = sc.nextInt();

        futureDay = (DDay + elapsedDays) % 7;

        String [] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        if (futureDay >= 0 && futureDay < 7) {
            System.out.println("Today is " + daysOfWeek[DDay] + " and the future day is " + daysOfWeek[futureDay] + ".");
        }else{
            System.out.println("Please enter the valid day and elapsed days!");
        }
    }
}
