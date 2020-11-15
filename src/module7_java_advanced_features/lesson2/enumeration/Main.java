package module7_java_advanced_features.lesson2.enumeration;

class Main {

    public static void main(String[] args) {

        Person p = new Person();
        p.setGender(Gender.FEMALE);
        System.out.println(p.getGender());

        System.out.println();
        for (int i = 0; i < Gender.values().length; i++) {
            System.out.println(Gender.values()[i]);
        }
    }
}
