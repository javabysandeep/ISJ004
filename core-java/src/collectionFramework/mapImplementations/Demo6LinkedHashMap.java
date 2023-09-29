package collectionFramework.mapImplementations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo6LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> subjectMarks = new LinkedHashMap<>();
        subjectMarks.put("Physics", 100);
        subjectMarks.put("Chemistry", 57);
        subjectMarks.put("maths", 98);
        subjectMarks.put("Biology", 36);
        subjectMarks.put("English", 57);
        subjectMarks.put("Geography", 99);

        Integer maximum = Integer.MIN_VALUE;
        String maxSubjectName = "";
        Set<Map.Entry<String, Integer>> entries = subjectMarks.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > maximum) {
                maximum = entry.getValue();
                maxSubjectName = entry.getKey();
            }
        }
        System.out.println("Maximum subject " + subjectMarks.get(maxSubjectName));

    }
}
