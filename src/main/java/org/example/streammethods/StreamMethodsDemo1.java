package org.example.streammethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//  sorted()
public class StreamMethodsDemo1 {

    public static void main(String[] args) {

        List<Integer> listNum = Arrays.asList(2,4,1,3,7,5,9);

        // sorted()
        //Integer
        // default sorting order asc order
        List<Integer> sortedList = listNum.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        // reverseOrder
        List<Integer> reverseSortedOrder = listNum.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedOrder);

        // String
        List<String> listString = Arrays.asList("Z","A","C","ZA","D");
        List<String> sortedString = listString.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedString);

        List<String> reverseSortedString = listString.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedString);

    }
}
