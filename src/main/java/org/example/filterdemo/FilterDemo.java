package org.example.filterdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {

        // creates collection
        List<Integer> numList = Arrays.asList(1,2,3,5,7,4,1,5,6,55,68,98,45,15);

        // converting collection to stream and applying filter and again converted to list
        List<Integer> evenList = numList.stream().filter(n->n%2==0).collect(Collectors.toList());

        System.out.println(evenList);

        // way to print value from stream with filter and sorted with asc
        numList.stream().filter(n->n%2==0).sorted().forEach(System.out::println);

        // way to print value from stream with filter and sorted with desc
        numList.stream().filter(n->n%2==0).sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}