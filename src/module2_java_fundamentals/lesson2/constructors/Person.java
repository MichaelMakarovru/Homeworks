package module2_java_fundamentals.lesson2.constructors;

class Person {

    public String name;
    public int age;
    public char gender;
    public boolean isActiveClient;
    public String address;

    public Person() {

    }

    public Person(String name, int age, String livingAddress) {
        this.name = name;
        this.age = age;
        address = livingAddress;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }


}
