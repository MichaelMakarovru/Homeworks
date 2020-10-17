package module2_java_fundamentals.lesson2.accessmodifiers;

public class AccessModifiersExamples {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("John323");
        employee.setPosition(null);
        System.out.println("Name = " + employee.getName());
        System.out.println("Position = " + employee.getPosition());
        employee.setPosition("Director");
        System.out.println("Position = " + employee.getPosition());
    }
}
