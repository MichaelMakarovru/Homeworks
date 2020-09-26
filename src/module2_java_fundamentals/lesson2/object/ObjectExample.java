package module2_java_fundamentals.lesson2.object;

public class ObjectExample {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("John");
        Person person2 = new Person();
        person2.setName("John");

        System.out.println(person == person2);
        System.out.println(person);
        System.out.println(person2);
        System.out.println();
//
//        person2 = person;
//        System.out.println(person);
//        System.out.println(person2);
//        System.out.println(person == person2);
//        System.out.println();

        System.out.println(person.equals(person2));
        System.out.println();

        int x = 5;
        int y = 5;
        System.out.println(x == y);


    }
}
