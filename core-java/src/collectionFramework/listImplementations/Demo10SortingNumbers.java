package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.Collections;

public class Demo10SortingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(90);
        integers.add(87);
        integers.add(65);
        integers.add(78);
        integers.add(53);
        integers.add(31);
        Collections.sort(integers);
        System.out.println(integers);


    }
}
