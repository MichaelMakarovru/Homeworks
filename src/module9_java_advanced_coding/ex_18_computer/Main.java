package module9_java_advanced_coding.ex_18_computer;

class Main {

    public static void main(String[] args) {

        Computer dell = new Computer("Dell", "G3", "32");
        Computer dell1 = new Computer("Dell", "G3", "32");
        Computer dell2 = dell1;
        Computer compaq = new Computer("Compaq", "D1", "32");

        System.out.println(dell);
        System.out.println(compaq);

        System.out.println("Dell equals compaq: " + dell.equals(compaq));
        System.out.println("Dell == Dell1: " + (dell == dell1));
        System.out.println("Dell equals Dell1: " + (dell.equals(dell1)));
        System.out.println("Dell2 == Dell1: " + (dell2 == dell1));
        System.out.println("Dell hash: " + dell.hashCode());
        System.out.println("Compaq hash: " + compaq.hashCode());

        System.out.println();

        Laptop dellLaptop = new Laptop("Dell", "G3", "32", "10");
        Computer compaqLaptop = new Laptop("Compaq", "D1", "32", "8");

        System.out.println(dellLaptop);
        System.out.println(compaqLaptop);

        dellLaptop.getBattery();
    }
}
