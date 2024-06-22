package SelectionTest;
import java.util.Scanner;
public class employeesPay {
    public static void main(String[] args) {
        String position;
        int hourWorked;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your position : ");
        position = sc.nextLine();
        System.out.println("Enter the number of hours worked : ");
        hourWorked = sc.nextInt();

        if (position.equals("Lecturer")) {
            if (hourWorked > 160) {
                double salary = (160* 12000) + ((hourWorked-160)*12000*1.5);
                System.out.println("Total salary for lecturer is " + "$" + salary);
            }
            else
            {
                System.out.println("Total salary for lecturer is " + "$" + (hourWorked * 12000) );
            }
        }
        else if (position.equals("Senior Lecturer"))
        {
            if (hourWorked > 160)
            {
                double salary = (160* 20000) + ((hourWorked-160)*20000 *1.5);
                System.out.println("Total salary for lecturer is " + "$" + salary);
            }
            else
            {
                System.out.println("Total salary for lecturer is " + "$" + (hourWorked * 20000));
            }
        }
        else
        {
            System.out.println("Wrong Position" );
        }

    }
}
