package collectionFramework.cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Demo15RetrieveElementsVector {
    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>();
        integers.add(90);
        integers.add(87);
        integers.add(65);
        integers.add(78);
        integers.add(53);
        integers.add(31);
        Enumeration<Integer> elements = integers.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }

    }
}
