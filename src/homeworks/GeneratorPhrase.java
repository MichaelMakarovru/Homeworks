package homeworks;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class GeneratorPhrase {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трэш", "лакшери", "ай всё", "круглый", "огроменный" +
                "метод", "крот"};
        String[] wordListTwo = {"оранжевый", "классный", "кожанный", "деревянный"};
        String[] wordListThree = {"талант", "рог", "люкс", "купец", "машина"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Всё, что нам нужно, - это " + phrase);

        System.out.println();
        int x = 3;
        while (x > 0) {
            if (x > 2)
                System.out.print("a");

                x = x - 1;
                System.out.print("-");


                if (x == 2) {
                    System.out.print("b c");
                }


                    if (x == 1) {
                        System.out.print("d");

                        x = x - 1;
                    }



                }
        System.out.println();
        int q = 1;
        while (q < 10){
            q = q+1;
            if (q >3){
                System.out.println("большой икс");
            }
        }
        System.out.println();
        int w = 5;
        while (w > 1){
            w = w - 1;
            if (w <3){
                System.out.println("маленький икс");
            }
        }



            }

        }


