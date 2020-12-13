package module9_java_advanced_coding.ex_04_storage;

class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.addToStorage("Pet", "Cat");
        storage.addToStorage("Pet", "Dog");
        storage.addToStorage("Pet", "Cat");

        storage.addToStorage("Wild", "Tiger");
        storage.addToStorage("Wild", "Lion");
        storage.addToStorage("Wild", "Zebra");

        storage.addToStorage("Zoo", "Tiger");

        storage.addToStorage("Circus", "Cat");

        System.out.println("Pets:");
        storage.printValues("Pet");
        System.out.println();

        System.out.println("Wild:");
        storage.printValues("Wild");
        System.out.println();

        System.out.println("Tigers:");
        storage.findKeys("Tiger");
        System.out.println();

        System.out.println("Cats:");
        storage.findKeys("Cat");
        System.out.println();

    }
}
