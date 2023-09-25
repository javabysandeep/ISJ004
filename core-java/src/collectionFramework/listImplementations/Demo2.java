package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(10.56f);
        arrayList.add(true);
        arrayList.add("sting data");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add('A');
        System.out.println(arrayList.toString());
        System.out.println("Size of the collection "+arrayList.size());

        arrayList.remove("sting data");
        System.out.println(arrayList);
        System.out.println("Size of the collection "+arrayList.size());

    }
}
