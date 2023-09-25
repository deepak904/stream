package org.example.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<String> listA = Arrays.asList("Ram","Sham","Deen");
        List<String> listB = Arrays.asList("Manash","Ramesh","Pawan");
        List<String> listC = Arrays.asList("Harry","Jim","Maria");

        List<List<String>> listAll = Arrays.asList(listA,listB,listC);

        // flatMap will flatMap will convert collection of collections to stream
        List<String> collect = listAll.stream().flatMap(p -> p.stream()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
