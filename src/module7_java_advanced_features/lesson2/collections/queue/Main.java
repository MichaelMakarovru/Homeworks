package module7_java_advanced_features.lesson2.collections.queue;

import java.util.ArrayDeque;

class Main {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        //FIFO
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Orange");

        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.size());

        //LIFO
        deque.push("Apple");
        deque.push("Banana");
        deque.push("Orange");

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.size());
    }
}
