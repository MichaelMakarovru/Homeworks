package module2_java_fundamentals.lesson2.accessmodifiers;

class Employee {
    //private means that we cannot access these variables from another class
    private String name;
    private String position;

    //we declare public methods to set value of name variable
    //public methods and variables are accessible from any other class
    public void setName(String name) {
        if (null == name) {
            this.name = "Unknown";
            return;
        }
        name = name.replaceAll("\\d", "");
        this.name = name;
    }

    public void setPosition(String position) {
        if (null == position) {
            this.position = "Unknown";
            return;
        }
       this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}
