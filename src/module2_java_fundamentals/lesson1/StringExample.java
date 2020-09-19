package module2_java_fundamentals.lesson1;

public class StringExample {

    public static void main(String[] args) {
        String hello = "Hello!";
        String world = "World";

        int x = 5;
        int y = 5;
        System.out.println(x == y);
        y++;
        System.out.println(y);

        String hello2 = new String("Hello!");
        System.out.println(hello == hello2);
        System.out.println(hello.equals(hello2));
        System.out.println(world == hello);
        System.out.println(world.equals(hello));

        String hello3 = "Hello!";
        System.out.println(hello == hello3);

        String cat = "Cat";
        cat = "Thomas the " + cat;
        System.out.println(cat);
        System.out.println();

        cat = "Cat";
        cat = cat.concat("s");
        System.out.println(cat);
        System.out.println();
        int z = 5;
        int h = 10;
        String cow = "Cow";
        System.out.println(cow + z + h);
        System.out.println(cow + (z + h));
        System.out.println(z + h + cow);
        System.out.println(z + (h + cow));

        int sum = z + h;
        System.out.println("Sum = " + sum);

    }
}
