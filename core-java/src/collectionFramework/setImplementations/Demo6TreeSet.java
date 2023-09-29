package collectionFramework.setImplementations;

import java.util.Set;
import java.util.TreeSet;

public class Demo6TreeSet {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(101);
        integers.add(1);
        integers.add(1);
        integers.add(21);
        integers.add(21);
        integers.add(31);
        integers.add(31);
        integers.add(99);

        integers.forEach(System.out::println);
    }
}
