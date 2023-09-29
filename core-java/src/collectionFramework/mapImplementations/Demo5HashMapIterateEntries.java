package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo5HashMapIterateEntries {
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
        Set<Map.Entry> entries = map.entrySet();
        //enhanced for loop
        System.out.println("iterating the entries only using enhanced for loop");
        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        // forEach : java 8 method
        System.out.println("iterating the entries only using forEach java 8 way");
        entries.forEach(System.out::println);

        //iterator
        System.out.println("iterating the entries only using cursor - iterator way");
        Iterator<Map.Entry> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

    }
}
