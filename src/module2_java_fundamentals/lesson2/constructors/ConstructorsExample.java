package module2_java_fundamentals.lesson2.constructors;

public class ConstructorsExample {

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
        System.out.println(person.isActiveClient);
        System.out.println(person.address);
        System.out.println();

        Person person2 = new Person("John", 25, "Riga");
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.address);
        System.out.println();

        String personName = "Sarah";
        int personAge = 22;
        String personAddress = "New York";
        Person person3 = new Person(personName, personAge, personAddress);
        System.out.println(person3.name);
        System.out.println(person3.age);
        System.out.println(person3.address);
        System.out.println();

        Person person4 = new Person("John", "Riga");
        System.out.println(person4.name);
        System.out.println(person4.age);
        System.out.println(person4.address);
        System.out.println();
    }
}
