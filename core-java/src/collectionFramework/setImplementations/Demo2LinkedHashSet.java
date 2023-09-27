package collectionFramework.setImplementations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo2LinkedHashSet {
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
    }
}
