package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo16RetrieveElementsUsingIteratorRemove {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
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
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element % 2 != 0) {
                iterator.remove();
            }
        }
        integers.forEach(System.out::println);
    }
}
