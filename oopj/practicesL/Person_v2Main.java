public class Person_v2Main {
    public static void main(String[] args) {
        Person_v2 john = new Person_v2("John", 22, 'm', 1.0);
        Person_v2 mary = new Person_v2("Mary",18 , 'f', 1.8);
        Person_v2 harry = new Person_v2("Harry", 23, 'm', 1.2);

        //invoke the object's method
        john.intro();
        mary.intro();
        harry.intro();
    }
    
}
