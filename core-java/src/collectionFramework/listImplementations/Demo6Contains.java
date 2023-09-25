package collectionFramework.listImplementations;

import java.util.ArrayList;

public class Demo6Contains {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(10.56f);
        arrayList.add(true);
        arrayList.add("sting data");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add('A');

        System.out.println(arrayList.contains("string data"));

    }
}
