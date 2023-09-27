package collectionFramework.setImplementations;

import java.util.Set;
import java.util.TreeSet;

public class Demo7 {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Ziya");
        stringSet.add("Salman");
        stringSet.add("Ritik");
        stringSet.add("Don");
        stringSet.add("Bhai");
        stringSet.add("Bablu");
        stringSet.add("Chotu");
        stringSet.add("Vaibhav");

        stringSet.forEach(System.out::println);
    }
}
