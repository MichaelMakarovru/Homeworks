package module2_java_fundamentals.lesson4.staticmembers;

class Person {
    //static fields are shared by all instances of the class
    public static int personCount = 0;

    //final field. we cannot change it once it is initialised
    private final long id;
    private String name;
    private int age;

    public Person() {
        //we can initialise id only once
        this.id = ++personCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    //static method changes static variable
    public static void increasePersonCount() {
        personCount++;
    }
}
