package module2_java_fundamentals.lesson5.immutableobject;

public class Runner {

    public static void main(String[] args) {

        ImmutableObject immutableObject = new ImmutableObject(200, 'a');
        System.out.println(immutableObject.getAmount());
        System.out.println(immutableObject.getCharacter());

        immutableObject = immutableObject.setAmount(500);
        immutableObject = immutableObject.setCharacter('b');

        System.out.println(immutableObject.getAmount());
        System.out.println(immutableObject.getCharacter());
    }
}
