package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo19RemoveElementIterator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(90);
        arrayList.add(87);
        arrayList.add(65);
        arrayList.add(78);
        arrayList.add(53);
        arrayList.add(31);

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == 53) {
               // arrayList.remove(element);
                iterator.remove();
            }
        }


        arrayList.forEach(System.out::println);
    }
}
