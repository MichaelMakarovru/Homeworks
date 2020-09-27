package module2_java_fundamentals.lesson3.arrays.objectarray;

public class ObjectArrayExample {

    public static void main(String[] args) {

        Person john = new Person();
        john.setName("John Doe");
        john.setAge(25);

        Person sarah = new Person();
        sarah.setName("Sarah Smith");
        sarah.setAge(29);

        //We can create array of any object
        Person[] personArray = new Person[2];
        personArray[0] = john;
        personArray[1] = sarah;

        for (int i = 0; i < personArray.length; i++) {
            Person person = personArray[i];
            System.out.print(person.getName());
            System.out.print(" ");
            System.out.println(person.getAge());
            System.out.println();
        }
    }
}
