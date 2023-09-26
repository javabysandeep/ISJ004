package collectionFramework.listImplementations;

import java.util.ArrayList;

public class Demo11RetrieveElements {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(90);
        integers.add(87);
        integers.add(65);
        integers.add(78);
        integers.add(53);
        integers.add(31);
        //read or access or retrieve single element
        System.out.println(integers.get(0));
        System.out.println(integers.get(1));
        System.out.println(integers.get(2));
        System.out.println(integers.get(3));
        System.out.println(integers.get(4));
        System.out.println(integers.get(5));
        System.out.println(integers.get(6));
    }
}
