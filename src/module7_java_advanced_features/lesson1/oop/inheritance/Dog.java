package module7_java_advanced_features.lesson1.oop.inheritance;

import java.util.Objects;

//Dog is an Animal and Object
class Dog extends Animal {

    public String name;

    public void huntDucks() {
        System.out.println("Dog hunts ducks.");
    }

    //Override equals() method declared inside Object class
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (null == obj) return false;
        if (obj.getClass() != this.getClass()) return false;
        Dog dog = (Dog) obj;
        return dog.name.equals(this.name);
    }
}
