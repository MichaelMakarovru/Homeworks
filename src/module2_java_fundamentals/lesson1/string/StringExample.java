package module2_java_fundamentals.lesson1.string;

public class StringExample {

    public static void main(String[] args) {
        //Create strings with literals, like primitive data types
        String hello = "Hello!";
        String world = "World";

        //We can also create strings using calling a constructor
        //using a new keyword
        String hello2 = new String("Hello!");
        //Do not use == operator to compare objects.
        System.out.println("Hello! == Hello!: " + (hello == hello2));
        //Use equals method to compare objects.
        System.out.println("Hello! equals Hello!: " + hello.equals(hello2));
        System.out.println("World == Hello!: " + (world == hello));
        System.out.println("World equals Hello!: " + world.equals(hello));

        String hello3 = "Hello!";
        //hello == hello3 returns true, because both where created using
        //literal, hence both references point to the same address in
        //memory
        System.out.println("hello == hello3: " + (hello == hello3));
        System.out.println();

        //String concatenation
        String cat = "Cat";
        System.out.println(cat);
        //Assign result to the variable, because strings are immutable
        cat = "Thomas the " + cat;
        System.out.println(cat);
        System.out.println();

        cat = "Cat";
        //You can use + operator or method concat to concatenate strings
        cat = cat.concat("s");
        System.out.println(cat);
        System.out.println();

        int z = 5;
        int h = 10;
        String cow = "Cow";
        //Strings are concatenated from left to right
        System.out.println("cow + z + h = " + (cow + z + h));
        System.out.println("cow + (z + h) = " + (cow + (z + h)));
        System.out.println("z + h + cow = " + (z + h + cow));
        System.out.println("z + (h + cow) = " + (z + (h + cow)));
    }
}
