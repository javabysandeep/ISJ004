package collectionFramework.listImplementations;

import java.util.ArrayList;

public class Demo8Operations {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Salman");
        nameList.add("Shahrukh");
        nameList.add("Irfaan");
        nameList.add("Arijit");
        nameList.add("KK");
        nameList.add("Nawaz");
        nameList.add("Pankaj Tripathi");

        nameList.set(0,"Salmaan");
        System.out.println(nameList);
        System.out.println("Is collection empty : "+nameList.isEmpty());


    }
}
