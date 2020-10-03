package module2_java_fundamentals.lesson4.staticmembers;

class Person {

    public static int personCount = 0;

    private final long id;
    private String name;
    private int age;

    public Person() {
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

    public static void increasePersonCount() {
        personCount++;
    }
}
