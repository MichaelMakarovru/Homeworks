package module7_java_advanced_features.lesson4.functional_programming.example;

class Animal {

    private String name;
    private boolean canHop;
    private boolean canSwim;
    private boolean canFly;
    private boolean canCrawl;

    public Animal(String name, boolean canHop, boolean canSwim, boolean canFly, boolean canCrawl) {
        this.name = name;
        this.canHop = canHop;
        this.canSwim = canSwim;
        this.canFly = canFly;
        this.canCrawl = canCrawl;
    }

    public String getName() {
        return name;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public boolean canFly() {
        return canFly;
    }

    public boolean canCrawl() {
        return canCrawl;
    }

    @Override
    public String toString() {
        return name;
    }
}
