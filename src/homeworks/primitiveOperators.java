package homeworks;

//import com.sun.org.glassfish.external.statistics.impl.AverageRangeStatisticImpl;

//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.List;

public class primitiveOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 13;

        System.out.println("a = " + a + " | b = " + b);

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("a = " + a + " | b = " + b);


        System.out.println();
        a = -a-b;
        b = -a-b;
        a = -a-b;
        System.out.print(a +" "+b);

        System.out.println();
        int x = 1;
        while(x<4) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if(x==4) {
            System.out.print("Do");
        }





        }



    }

