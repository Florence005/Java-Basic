public class Person_v2 {
    //instance variable
    private String name;
    private int age ;
    private char gender;
    private double height;

    public Person_v2(String name, int age, char gender, double height){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    //a method to introduce itself
    public void intro(){
        String genderStr = (gender =='m')? "Male":"Female";

        System.out.printf("%s, %d, %s, %.1f%n", name, age, genderStr, height);
    }
    
}
