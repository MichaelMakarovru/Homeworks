package module2_java_fundamentals.lesson4.staticmembers;

public class FinalExamples {

    public static void main(String[] args) {

        //we cannot change final variables
        final int x = 5;
        //x++;

        //we can initialize final variable only once
        final int y;
        y = 6;
        //y++;

        //if reference is final
        // we can change referred object
        // but we cannot change address reference is pointing to
        final Person john = new Person();
        john.setName("John");
        john.setAge(25);
        System.out.println("Name = " + john.getName());
        System.out.println("Age = " + john.getAge());
        john.setAge(26);
        System.out.println("Age = " + john.getAge());
        //cannot refer to new object, because john is final
        //john = new Person();

        Person sarah = new Person();
        sarah.setName("Sarah");
        System.out.println(sarah);
        System.out.println(sarah);

        sarah = new Person();
        System.out.println(sarah);

        //example of using final variable (PI)
        double r = 0.5 * Math.PI;

        //Using static final variable
        System.out.println("Java was created in " + Helper.YEAR_JAVA_CREATED);
        System.out.println("Java was created in " + Helper.YEAR_JAVA_CREATED);
    }
}
