package SelectionTest;
import java.util.*;
public class BMI {
    public static void main(String[] args) {

        float weightInPounds, heightInInches ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in lb : ");
        weightInPounds = sc.nextInt();

        System.out.println("Enter your height in inches :");
        heightInInches = sc.nextInt();

        float weightInKg= weightInPounds * 0.453592f;
        float heightInMeters = heightInInches * 0.0254f;
        float BMI = weightInKg / (heightInMeters * heightInMeters);
        System.out.println("Your BMI is " + BMI);

        if(BMI <= 18.5) {
            System.out.println("Your BMI is underweight");
        }else if (BMI <= 25.00) {
            System.out.println("Your BMI is normal");
        }else if (BMI <= 30.00) {
            System.out.println("Your BMI is overweight");
        }else {
            System.out.println("Your BMI is obese");
        }


    }
}
