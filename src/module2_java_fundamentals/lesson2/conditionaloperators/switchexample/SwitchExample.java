package module2_java_fundamentals.lesson2.conditionaloperators.switchexample;

public class SwitchExample {

    public static void main(String[] args) {

        int dayOfWeek = 9;
        if (dayOfWeek == 6) {
            System.out.println("It's Saturday!");
        } else if (dayOfWeek == 7) {
            System.out.println("It's Sunday!");
        } else if (dayOfWeek == 5) {
            System.out.println("It's Friday");
        } else if (dayOfWeek == 4) {
            System.out.println("It's Thursday");
        } else if (dayOfWeek == 3) {
            System.out.println("It's Wednesday");
        } else if (dayOfWeek == 2) {
            System.out.println("It's Tuesday");
        } else if (dayOfWeek == 1) {
            System.out.println("It's Monday");
        } else {
            System.out.println("Error");
        }

        System.out.println();

        switch (dayOfWeek) {
            case 1: {
                System.out.println("It's Monday");
                break;
            }
            case 2: {
                System.out.println("It's Tuesday");
                break;
            }
            case 3: {
                System.out.println("It's Wednesday");
                break;
            }
            case 4: {
                System.out.println("It's Thursday");
                break;
            }
            case 5: {
                System.out.println("It's Friday");
                break;
            }
            case 6: {
                System.out.println("It's Saturday!");
                break;
            }
            case 7: {
                System.out.println("It's Sunday!");
                break;
            }
            default: {
                System.out.println("Error");
            }
        }
    }
}
