package collectionFramework.listImplementations;

import java.util.ArrayList;

public class Demo7ContainsAll {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Salman");
        nameList.add("Shahrukh");
        nameList.add("Irfaan");
        nameList.add("Arijit");
        nameList.add("KK");
        nameList.add("Nawaz");
        nameList.add("Pankaj Tripathi");

        ArrayList<String> search = new ArrayList<>();
        search.add("Salman");
        search.add("Shahrukh");
        search.add("Amir");


        System.out.println(nameList.containsAll(search));

    }
}
