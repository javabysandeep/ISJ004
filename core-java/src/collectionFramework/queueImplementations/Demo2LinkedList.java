package collectionFramework.queueImplementations;

import java.util.LinkedList;
import java.util.Queue;

public class Demo2LinkedList {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(10);
        integerQueue.add(101);
        integerQueue.add(20);
        integerQueue.add(40);
        integerQueue.add(67);
        // 67--> 40 --> 20 --> 101 --> 10
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println("Queue size " + integerQueue.size());
    }
}
