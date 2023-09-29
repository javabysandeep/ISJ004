package collectionFramework.mapImplementations;

import java.util.HashMap;

public class Demo9StringCharacterOccurance {
    public static void main(String[] args) {
        String str = "good morning";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }

        System.out.println(hashMap);
    }
}
