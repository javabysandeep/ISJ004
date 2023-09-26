package collectionFramework.listImplementations;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo13RetrieveElementsUsingIteratorLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(90);
        integers.add(87);
        integers.add(65);
        integers.add(78);
        integers.add(53);
        integers.add(31);

        Iterator<Integer> iterator = integers.iterator();
        //hasNext
        //next
        //remove
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
