package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.Collections;

public class Demo9Sorting {
    public static void main(String[] args) {
        ArrayList actorList = new ArrayList<>();
        actorList.add("Salman");
        actorList.add("Shahrukh");
        actorList.add("Irfaan");
        actorList.add("Arijit");
        actorList.add("KK");
        actorList.add("Nawaz");
        actorList.add("Pankaj Tripathi");
      //  actorList.add(123);

        Collections.sort(actorList);
        System.out.println(actorList);


    }
}
