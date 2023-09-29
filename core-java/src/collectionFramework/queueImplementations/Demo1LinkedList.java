package collectionFramework.queueImplementations;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1LinkedList {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        /*System.out.println(queue.poll()); //null
        System.out.println(queue.remove());*///exception
        System.out.println(queue.peek());//null
        System.out.println(queue.element());//exception
    }
}
