package collectionFramework.mapImplementations;

import java.util.Map;
import java.util.TreeMap;

public class Demo7TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> subjectMarks = new TreeMap<>();
        subjectMarks.put("Physics", 100);
        subjectMarks.put("Chemistry", 57);
        subjectMarks.put("maths", 98);
        subjectMarks.put("Biology", 36);
        subjectMarks.put("English", 57);
        subjectMarks.put("Geography", 99);
        //subjectMarks.put(null, 99);

        System.out.println(subjectMarks);


    }
}
