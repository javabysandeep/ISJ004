package collectionFramework.setImplementations;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {
    public static void main(String[] args) {
        //1. unique
        //2. no insertion order
        //3. homogeneous
        //4. heterogenous
        //5. null once
        //6. no sorting order
        Set set = new HashSet();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add("abc");
        set.add("abc");
        set.add(null);
        set.add(null);
        set.add(null);
        System.out.println(set);//[null, abc, 20, 10, 30]
    }
}
