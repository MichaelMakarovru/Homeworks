package module2_java_fundamentals.lesson4.visibility;

public class PassByValueExample {

    public static void main(String[] args) {
        int y = 5;
        System.out.println("Before: " + y);
        y = addOne(y);
        System.out.println("After: " + y);
        addOneBroken(y);
        System.out.println("After broken method: " + y);

        Person person = new Person("John", 25);
        System.out.println("Age = " + person.getAge());
        age(person);
        System.out.println("Age = " + person.getAge());
        System.out.println("Name = " + person.getName());
        ageBroken(person);
        System.out.println("Age = " + person.getAge());
        System.out.println("Name = " + person.getName());
    }

    public static int addOne(int x) {
        return x + 1;
    }
    //this method does not affect passed parameter
    public static void addOneBroken(int x) {
        x = x + 1;
    }

    //this method affects object referred by passed reference
    public static void age(Person person) {
        int currentAge = person.getAge();
        person.setAge(currentAge + 1);
    }

    //this method does not affect passed reference
    public static void ageBroken(Person person) {
        person = new Person("Sarah", 21);
    }
}
