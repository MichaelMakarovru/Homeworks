package module9_java_advanced_coding.ex_07_magazine;

import java.util.ArrayList;
import java.util.List;

class ListMagazine {

    private int capacity;
    private List<String> stack;

    public ListMagazine(int capacity) {
        this.capacity = capacity;
        this.stack = new ArrayList<>();
    }

    public void loadBullet(String bullet) {
        if (stack.size() < capacity) {
            stack.add(bullet);
        } else {
            System.out.println("Magazine is fully loaded.");
        }
    }

    public boolean isLoaded() {
        return !stack.isEmpty();
    }

    public void shot() {

        if (isLoaded()) {
            System.out.println(stack.remove(stack.size() - 1));
        } else {
            System.out.println("Empty magazine.");
        }
    }
}
