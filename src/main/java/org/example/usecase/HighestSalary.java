package org.example.usecase;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalary {

    public static void main(String[] args) {
        Map<String, Integer> emp = new HashMap<>();


        emp.put("anil",1000);
        emp.put("ankit",1200);
        emp.put("lal",1400);
        emp.put("dav",1700);
        /*
        emp.put("anil", 1000);
        emp.put("ankit", 1200);
        emp.put("lal", 1200);
        emp.put("dav", 1400);
        emp.put("ram", 1300);
        emp.put("dinesh", 1300);
        emp.put("mony", 1400);
    */


        /*
        Map.Entry<String, Integer> result = emp.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(0);
        */


        System.out.println(findNthHighestSal(0,emp));

    }
    static Map.Entry<Integer, List<String>> findNthHighestSal(int num, Map<String,Integer> map){
        return map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(num);
    }

}
