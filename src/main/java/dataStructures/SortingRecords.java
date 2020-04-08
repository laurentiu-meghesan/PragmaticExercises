package dataStructures;

import java.time.LocalDate;
import java.util.*;

public class SortingRecords {

    public static void main(String[] args) {

        List<Map<String, Object>> records = new ArrayList<>();

        Map<String, Object> record1 = new HashMap<>();
        record1.put("firstName", "John");
        record1.put("lastName", "Johnson");
        record1.put("position", "Manager");
        record1.put("separationDate", LocalDate.of(2016, 12, 31));

        Map<String, Object> record2 = new HashMap<>();
        record2.put("firstName", "Tou");
        record2.put("lastName", "Xiong");
        record2.put("position", "Software Engineer");
        record2.put("separationDate", LocalDate.of(2016, 10, 05));

        Map<String, Object> record3 = new HashMap<>();
        record3.put("firstName", "Michaela");
        record3.put("lastName", "Michaelson");
        record3.put("position", "District Manager");
        record3.put("separationDate", LocalDate.of(2015, 12, 19));

        Map<String, Object> record4 = new HashMap<>();
        record4.put("firstName", "Jake");
        record4.put("lastName", "Jacobson");
        record4.put("position", "Programmer");
        record4.put("separationDate", null);

        Map<String, Object> record5 = new HashMap<>();
        record5.put("firstName", "Jacquelyn");
        record5.put("lastName", "Jackson");
        record5.put("position", "DBA");
        record5.put("separationDate", null);

        Map<String, Object> record6 = new HashMap<>();
        record6.put("firstName", "Sally");
        record6.put("lastName", "Weber");
        record6.put("position", "Web Developer");
        record6.put("separationDate", LocalDate.of(2015, 12, 18));

        records.add(record1);
        records.add(record2);
        records.add(record3);
        records.add(record4);
        records.add(record5);
        records.add(record6);

        records.sort(Comparator.comparing(map -> map.get("lastName").toString()));

        System.out.printf("%2s %15s %4s %8s %2s", "Name", "|", "Position", "|", "Separation Date");
        System.out.println();
        System.out.println("------------------------------------------------------");

//        for (Map.Entry<String, ArrayList<Edge>>)

        for (Map<String, Object> map: records) {
            Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
            if (iterator.hasNext()) {
                Map.Entry<String, Object> currentMapEntry= iterator.next();
//                System.out.println("%32s%10d%16s", currentMapEntry.getKey(),currentMapEntry.getValue());
            }
        }
        System.out.println("------------------------------------------------------");



    }
}
