package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //capacity = 10
        //size = 0;
        System.out.println("Size of the collection "+arrayList.size());

        arrayList.add(10);
        arrayList.add(10.56f);
        arrayList.add(true);
        arrayList.add("sting data");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add('A');
        System.out.println(arrayList.toString());
        System.out.println("Size of the collection "+arrayList.size());

        Collection collection = new ArrayList();
        collection.add("alpha");
        collection.add("beta");
        collection.add("gama");

        arrayList.addAll(collection);
        System.out.println("After adding the collection");

        System.out.println(arrayList.toString());
        System.out.println("Size of the collection "+arrayList.size());

    }
}
