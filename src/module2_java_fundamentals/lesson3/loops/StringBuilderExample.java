package module2_java_fundamentals.lesson3.loops;

public class StringBuilderExample {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        String string = "";
        for (int i = 0; i < 100000; i++) {
            string = string + i;
        }

        long end = System.currentTimeMillis();
        long result = (end - start) / 1000;
        //System.out.println(string);
        System.out.println();
        System.out.println("Concat = " + result);
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        end = System.currentTimeMillis();
        result = (end - start) / 1000;
        String resultString = stringBuilder.toString();
        System.out.println(resultString);
        System.out.println();
        System.out.println("StringBuilder = " + result);
    }
}
