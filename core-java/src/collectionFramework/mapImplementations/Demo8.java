package collectionFramework.mapImplementations;

import java.util.HashMap;

public class Demo8 {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('A', 1);
        hashMap.put('A', 2);
        hashMap.put('B', 2);
        System.out.println(hashMap);
        //A --> 2
        //B --> 2

    }
}
