package collectionFramework.mapImplementations;

import java.util.*;

public class Demo4HashMapIterateEntries {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(10, 10);
        map.put("Abc", 10);
        map.put(null, 10);
        map.put(null, 10);
        map.put(20, null);
        map.put(10, null);
        map.put(50, 50);

        // iterate all the entries
        Set entries = map.entrySet();
        //enhanced for loop
        System.out.println("iterating the entries only using enhanced for loop");
        for (Object obj : entries) {
            System.out.println(obj);
        }
        // forEach : java 8 method
        System.out.println("iterating the entries only using forEach java 8 way");
        entries.forEach(System.out::println);

        //iterator
        System.out.println("iterating the entries only using cursor - iterator way");
        Iterator iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
