package collectionFramework.cursors;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Demo14RetrieveElementsUsingIteratorVector {
    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>();
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
