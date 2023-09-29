package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2HashMapIterateKeys {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(10, 10);
        map.put("Abc", 10);
        map.put(null, 10);
        map.put(null, 10);
        map.put(20, null);
        map.put(10, null);
        map.put(50, 50);

        // iterate all the keys
        Set set = map.keySet();
        //enhanced for loop
        System.out.println("iterating the keys only using enhanced for loop");
        for (Object obj : set) {
            System.out.println(obj);
        }
        // forEach : java 8 method
        System.out.println("iterating the keys only using forEach java 8 way");
        set.forEach(System.out::println);

        //iterator
        System.out.println("iterating the keys only using cursor - iterator way");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
