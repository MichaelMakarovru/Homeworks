package module7_java_advanced_features.lesson4.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectionExample {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        //Obtain Class object by class name
        Class catClass = Class.forName("module7_java_advanced_features.lesson4.reflection.Cat");

        //Obtain Class object by class instance
        Cat tom = new Cat("Tom");
        Class catClassFromObject = tom.getClass();

        //Obtain Class object by class
        Class<Cat> catClazz = Cat.class;

        //Check if object is an instance of particular class
        System.out.println("Tom instanceOf Cat: " + (tom instanceof Cat));

        //Get constructor
        Constructor<Cat> constructor = catClazz.getConstructor(String.class);
        //Create instance of class with Constructor
        Cat otherCat = constructor.newInstance("Jerry");
        System.out.println(otherCat);
        System.out.println();

        //Get field
        Field field = catClazz.getField("name");
        System.out.println(field.getName());
        //Setting fields
        field.set(otherCat, "Spike");
        System.out.println(field.get(otherCat));
        System.out.println();

        //Get method
        Method methodRun = catClazz.getMethod("run");
        //Run method using invoke()
        methodRun.invoke(otherCat);
        methodRun.invoke(tom);
        System.out.println();

        //Get all class fields
        Field[] fields = catClazz.getFields();
        for (Field field1 : fields) {
            System.out.println(field1.getName());
        }
        System.out.println();

        //Get all class methods
        Method[] methods = catClazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println();
    }
}
