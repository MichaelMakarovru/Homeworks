package module9_java_advanced_coding.ex_05_sda_hash_set;

class Main {

    public static void main(String[] args) {

        SDAHashSet<String> set = new SDAHashSet<>();

        set.add("Cat");
        set.add("Dog");
        set.add("Tiger");
        set.add("Dog");
        set.add("Cat");
        set.add("Tiger");

        set.print();
        System.out.println();

        System.out.println("Contains cat: " + set.contains("Cat"));
        System.out.println("Contains zebra: " + set.contains("Zebra"));
        System.out.println();

        System.out.println("Size: " +  set.size());
        set.clear();
        System.out.println("Size: " +  set.size());
        set.print();
        System.out.println();

        set.add("Cat");
        set.add("Dog");
        set.add("Tiger");

        set.print();
        System.out.println();
        set.remove("Cat");
        set.print();
        System.out.println();
        set.remove("Dog");
        set.print();
        System.out.println();
        System.out.println(set.size());

        System.out.println();
        SDAHashSet<Integer> integerSDAHashSet = new SDAHashSet<>();
        integerSDAHashSet.add(12);
        integerSDAHashSet.add(25);
        integerSDAHashSet.print();
    }
}
