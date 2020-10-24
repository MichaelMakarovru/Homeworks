package module4_java_fundamentals_coding.exercise20;

class Main {

    public static void main(String[] args) {

        int userTries = UserVsCpu.play();
        int cpuTies = CpuVsUser.play();

        if (userTries < cpuTies) {
            System.out.println("User won!");
        } else if (cpuTies < userTries) {
            System.out.println("CPU won!");
        } else {
            System.out.println("Draw!");
        }
    }
}
