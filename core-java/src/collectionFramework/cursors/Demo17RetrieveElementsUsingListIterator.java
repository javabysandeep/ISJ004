package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo17RetrieveElementsUsingListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(90);
        arrayList.add(87);
        arrayList.add(65);
        arrayList.add(78);
        arrayList.add(53);
        arrayList.add(31);

        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            Integer element = listIterator.next();
            if (element > 80) {
                listIterator.set(element + 10);
            }
            if (element < 40) {
                listIterator.remove();
            }
        }

        arrayList.forEach(System.out::println);
    }
}
