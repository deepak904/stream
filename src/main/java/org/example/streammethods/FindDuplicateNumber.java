package org.example.streammethods;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateNumber {

    public static void main(String[] args) {

        //Integer[] input1 = {1,2,3,4,5,6,78,1,2};

        int [] input1 = {10,1,2,3,4,5,6,78,1,2,10};

        Object[] array1 = Arrays.stream(input1).mapToObj(i -> i).toArray();
        System.out.println(Arrays.toString(array1));

        Map<Integer, Long> map1 = Arrays.stream(input1)
                .mapToObj(i -> i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int[] array = map1.entrySet().stream()
                .filter(m -> m.getValue() > 1)
                .sorted(Collections.reverseOrder( Map.Entry.comparingByKey()))
                .map(m -> m.getKey()).mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(array));

        IntStream st1 = Arrays.stream(input1);


         st1.forEach(System.out::println);




        // Map<Integer, Long> collect = Arrays.asList(input1).stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

       // System.out.println(collect);

    }

}
