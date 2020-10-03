package module2_java_fundamentals.lesson4.wrappers;

public class WrappersExamples {

    public static void main(String[] args) {

        byte bytePrimitive = 5;
        Byte byteObject1 = new Byte((byte) 5);
        Byte byteObject2 = 5;
        Byte byteObject3 = Byte.valueOf((byte) 5);
        Byte byteObject4 = Byte.valueOf("5");

        short shortPrimitive = 5;
        Short shortObject1 = new Short((short) 5);
        Short shortObject2 = 5;
        Short shortObject3 = Short.valueOf((short) 5);
        Short shortObject4 = Short.valueOf("5");

        int intPrimitive = 5;
        Integer integerObject1 = new Integer(5);
        Integer integerObject2 = 5;
        Integer integerObject3 = Integer.valueOf(5);
        Integer integerObject4 = Integer.valueOf("5");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Max 5 & 3 = " + Integer.max(5, 3));
        System.out.println(Integer.parseInt("234"));
        System.out.println("Sum 5 & 3 = " + Integer.sum(5, 3));
        System.out.println(Integer.toBinaryString(5));

        long longPrimitive = 5L;
        Long longObject1 = new Long(5);
        Long longObject2 = 5L;
        Long longObject3 = Long.valueOf(5);
        Long longObject4 = Long.valueOf("5");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        float floatPrimitive = 2.5F;
        Float floatObject1 = Float.valueOf(2.5F);
        Float floatObject2 = 2.5F;

        double doublePrimitive = 2.5;
        Double doubleObject = 2.5;

        char a = 'a';
        Character aObject = 'a';
        System.out.println("1 is digit = " + Character.isDigit('1'));
        System.out.println("a is digit = " + Character.isDigit('a'));
        System.out.println("a is letter = " + Character.isLetter(a));
        System.out.println("A is upperCase = " + Character.isUpperCase('A'));

        boolean isTrue = true;
        Boolean isFalse = false;
        Boolean isTrueObject = Boolean.TRUE;
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
    }
}
