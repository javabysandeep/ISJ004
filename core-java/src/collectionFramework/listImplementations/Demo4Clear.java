package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.Collection;

public class Demo4Clear {
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


        arrayList.clear();
        System.out.println("After removal");
        System.out.println(arrayList.toString());


    }
}
