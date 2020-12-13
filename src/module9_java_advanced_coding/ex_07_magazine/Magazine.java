package module9_java_advanced_coding.ex_07_magazine;

import java.util.ArrayDeque;

class Magazine {

    private int capacity;
    private ArrayDeque<String> stack;

    public Magazine(int capacity) {
        this.capacity = capacity;
        this.stack = new ArrayDeque<>();
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
        //Shot with try-catch
//        try {
//            System.out.println(deque.pop());
//        } catch (NoSuchElementException e) {
//            System.out.println("Empty magazine.");
//        }
        //Shot without try-catch
        if (isLoaded()) {
            System.out.println(stack.pop());
        } else {
            System.out.println("Empty magazine.");
        }
    }
}
