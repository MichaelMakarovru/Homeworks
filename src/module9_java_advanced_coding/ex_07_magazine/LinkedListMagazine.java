package module9_java_advanced_coding.ex_07_magazine;

import java.util.LinkedList;

class LinkedListMagazine {

    private int capacity;
    private LinkedList<String> stack;

    public LinkedListMagazine(int capacity) {
        this.capacity = capacity;
        this.stack = new LinkedList<>();
    }

    public void loadBullet(String bullet) {
        if (stack.size() < capacity) {
            stack.push(bullet);
        } else {
            System.out.println("Magazine is fully loaded.");
        }
    }

    public boolean isLoaded() {
        return !stack.isEmpty();
    }

    public void shot() {

        if (isLoaded()) {
            System.out.println(stack.pop());
        } else {
            System.out.println("Empty magazine.");
        }
    }
}
