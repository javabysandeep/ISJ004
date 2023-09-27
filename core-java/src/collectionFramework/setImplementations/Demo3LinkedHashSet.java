package collectionFramework.setImplementations;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo3LinkedHashSet {
    public static void main(String[] args) {
        //1. unique
        //2. insertion order
        //3. homogeneous
        //4. heterogeneous
        //5. null once
        //6. no sorting order
        Set set = new LinkedHashSet();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add("abc");
        set.add("abc");
        set.add(null);
        set.add(null);
        set.add(null);
        System.out.println(set);//[10, 20, 30, abc, null]

        //enhanced for loop
        System.out.println("using enhanced");
        for (Object obj : set) {
            System.out.println(obj);
        }

        //foreach
        System.out.println("using foreach");
        set.forEach(System.out::println);

        //iterator
        System.out.println("using iterator");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Size "+set.size());

    }
}
