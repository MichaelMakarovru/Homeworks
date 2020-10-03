package module2_java_fundamentals.lesson4.staticmembers;

class StaticExamples {

    public static void main(String[] args) {

        Person john = new Person();
        john.setAge(23);
        john.setName("John");

        Person sarah = new Person();
        sarah.setAge(22);
        sarah.setName("Sarah");

        Person.increasePersonCount();

        Person megan = new Person();
        megan.setName("Megan");

        System.out.println(john.getName());
        System.out.println(sarah.getName());
        System.out.println(Person.personCount);
        System.out.println("John id = " + john.getId());
        System.out.println("Sarah id = " + sarah.getId());
        System.out.println("Megan id = " + megan.getId());
        System.out.println();

        String regNumber = "KA - 5684";
        String regNumber2 = "JG -45 56";
        regNumber = Helper.removeSpaces(regNumber);
        regNumber2 = Helper.removeSpaces(regNumber2);

        System.out.println(regNumber);
        System.out.println(regNumber2);
    }
}
