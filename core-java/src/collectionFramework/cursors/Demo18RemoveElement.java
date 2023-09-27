package collectionFramework.cursors;

import java.util.ArrayList;

public class Demo18RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(90);
        arrayList.add(87);
        arrayList.add(65);
        arrayList.add(78);
        arrayList.add(53);
        arrayList.add(31);

        for (int index = 0; index < arrayList.size(); index++) {
            Integer element = arrayList.get(index);
            if (element == 53) {
                arrayList.remove(element);
            }
        }



        arrayList.forEach(System.out::println);
    }
}
