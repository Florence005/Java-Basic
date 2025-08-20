import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
public class Person_v3 {
    private String name;
    private int age;
    private char gender;
    private String job;

    public Person_v3(String _name, int _age, char _gender, String _job){
        this.name = _name;
        this.age = age;
        this.gender = _gender;
        this.job = _job;
    }

    public void intro(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your year of birht: ");
        int yob = in.nextInt();

        int currentAge = LocalDateTime.now().getYear();
        int realAge = currentAge -yob;
        System.out.print(name);

        
        if(gender != 'f'){
            System.out.print(", " + realAge);
        }
            System.out.println(", " + job + ".");
    }
}
