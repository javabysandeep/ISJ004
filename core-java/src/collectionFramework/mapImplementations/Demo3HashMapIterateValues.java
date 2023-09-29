package collectionFramework.mapImplementations;

import java.util.*;

public class Demo3HashMapIterateValues {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(10, 10);
        map.put("Abc", 10);
        map.put(null, 10);
        map.put(null, 10);
        map.put(20, null);
        map.put(10, null);
        map.put(50, 50);

        // iterate all the values
        Collection values = map.values();
        //enhanced for loop
        System.out.println("iterating the values only using enhanced for loop");
        for (Object obj : values) {
            System.out.println(obj);
        }
        // forEach : java 8 method
        System.out.println("iterating the values only using forEach java 8 way");
        values.forEach(System.out::println);

        //iterator
        System.out.println("iterating the values only using cursor - iterator way");
        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
