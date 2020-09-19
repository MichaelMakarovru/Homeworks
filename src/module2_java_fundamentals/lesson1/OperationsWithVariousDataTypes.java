package module2_java_fundamentals.lesson1;

public class OperationsWithVariousDataTypes {

    public static void main(String[] args) {

        byte x = 110;
        System.out.println(x);
        x = (byte) (x + 100);
        System.out.println(x);

        short z = 3;
        System.out.println(z);
        z = (short) (z * 100);
        System.out.println(z);

        double y = 5.23;
        int u = (int) y;
        System.out.println(u);

        System.out.println();
        double a = 5.34;
        int b = 5;
        System.out.println(a * b);
        System.out.println((int)(a * b));
        System.out.println(b / a);

        System.out.println();
        char p = 'p';
        int n = p;
        System.out.println(n);

        System.out.println();
        char q = 'a';
        q += 1;
        System.out.println(q);

        long i = 999999999999999L;
        float f = 34.5F;
        System.out.println();
        int m = 0b110; //1 * 4 + 1 * 2 + 0 * 1 = 6;
        System.out.println(m);
        m = 015; // 1 * 8 + 5 * 1 = 13
        System.out.println(m);
        m = 0x2A;
        System.out.println(m);
        System.out.println();
        double money = 2.00;
        for (int j = 0; j < 4; j++) {
            money = money + 0.01;
        }
        System.out.println(money);
    }
}
