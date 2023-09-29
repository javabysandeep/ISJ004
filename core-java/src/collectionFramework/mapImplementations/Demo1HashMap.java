package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class Demo1HashMap {
    public static void main(String[] args) {
        //1. unique keys
        //2. homogeneous keys
        //3. heterogeneous keys
        //4. null insertion at key only once
        //5. insertion order is not maintained.

        Map map = new HashMap();

        map.put(10, 10);
        map.put("Abc", 10);
        map.put(null, 10);
        map.put(null, 10);
        map.put(20, null);
        map.put(10, null);
        map.put(50, 50);

        System.out.println(map);
        System.out.println(map.get(10));

       /* System.out.println("iterating map elements using traditional for loop");
        for (int index = 1; index <= map.size() ; index++) {
            System.out.println(map.get(index));
        }*/

        System.out.println("Only keys"+map.keySet());
        System.out.println("Only Values "+map.values());
        System.out.println("key check "+map.containsKey("Abc"));
        System.out.println("Value check "+map.containsValue(50));
        map.remove(50);
        System.out.println(map);
    }
}
