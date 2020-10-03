package module2_java_fundamentals.lesson4.staticmembers;

public class FinalExamples {

    public static void main(String[] args) {

        final int x = 5;
        //x++;

        final int y;
        y = 6;
        //y++;

        final Person john = new Person();
        john.setName("John");
        john.setAge(25);
        System.out.println("Name = " + john.getName());
        System.out.println("Age = " + john.getAge());
        john.setAge(26);
        System.out.println("Age = " + john.getAge());
        //john = new Person();

        Person sarah = new Person();
        sarah.setName("Sarah");
        System.out.println(sarah);
        System.out.println(sarah);

        sarah = new Person();
        System.out.println(sarah);

        double r = 0.5 * Math.PI;

        System.out.println("Java was created in " + Helper.YEAR_JAVA_CREATED);
        System.out.println("Java was created in " + Helper.YEAR_JAVA_CREATED);
    }
}
