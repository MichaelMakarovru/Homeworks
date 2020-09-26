package module2_java_fundamentals.lesson2.conditionaloperators.ifelse;

public class IfElseExample {

    public static void main(String[] args) {

        int x = 5;
        if (x >= 5) {
            System.out.println("Hello!");
            System.out.println("X >= 5");
        }
        if (x < 5) {
            System.out.println("Hello!");
            System.out.println("X < 5");
        }
        System.out.println("Bye!");
        System.out.println();

        if (x >= 5) {
            System.out.println("x >= 5");
        } else {
            System.out.println("x < 5");
        }
        System.out.println();

        int dayOfWeek = 9;
        if (dayOfWeek == 6) {
            System.out.println("It's Saturday!");
        } else if (dayOfWeek == 7) {
            System.out.println("It's Sunday!");
        } else if (dayOfWeek == 5){
            System.out.println("It's Friday");
        } else if (dayOfWeek == 4) {
            System.out.println("It's Thursday");
        } else if (dayOfWeek == 3) {
            System.out.println("It's Wednesday");
        } else if (dayOfWeek == 2) {
            System.out.println("It's Tuesday");
        } else if (dayOfWeek == 1) {
            System.out.println("It's Monday");
        }
        System.out.println();

        int w = 2;
        boolean isTrue = w == 2;

        if (isTrue) {
            System.out.println("w == 2 : " + (isTrue));
        }
    }
}
