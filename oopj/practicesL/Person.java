public class Person{
	//attributes
	private String name ="John";
	private int age = 22;
	private char gender ='m';
	private double height = 1.6;
	
	//a method to introduce john
	public void intro(){
		String genderStr = (gender == 'm')? "Male":"Female";
		System.out.printf("%s, %d, %s, %.1f%n", name, age, genderStr, height);
	}
}