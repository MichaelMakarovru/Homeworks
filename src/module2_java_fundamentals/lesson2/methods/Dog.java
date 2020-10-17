package module2_java_fundamentals.lesson2.methods;

class Dog {

    public String name;
    public int age;

    public void makeNoise() {
        System.out.println(name + " is barking. Bark!");
    }

    public int getDogAge() {
        System.out.println("It's " + name + "'s birthday!");
        age = age + 1;
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}
