package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Demo12RetrieveElements {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(90);
        integers.add(87);
        integers.add(65);
        integers.add(78);
        integers.add(53);
        integers.add(31);
        //way 1 : read or access or retrieve all element : for loop
        System.out.println("using traditional loop");
        for (int index = 0; index < integers.size(); index++) {
            System.out.println(integers.get(index));
        }

        //way 2 : accessing the elements using forEach
        System.out.println("using foreach loop or enhanced loop");
        for (Integer temp : integers) {
            System.out.println(temp);
        }

        // way 3 : using java 8
        Consumer<Integer> consumer =   (integer)-> System.out.println(integer);
        integers.forEach(consumer);

        // way 4 : using java 8 - method reference
        Consumer<Integer> methodReference =   System.out::println;
        integers.forEach(System.out::println);

        // way 5 : using iterator
        System.out.println("Using iterator or cursor");
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            System.out.println(element);
        }


    }
}
