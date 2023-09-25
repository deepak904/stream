package org.example.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// concat()
public class StreamMethodsDemo4 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Apple","Banana","Grapes");
        List<String> list2 = Arrays.asList("Dog","Elephant","Cat");

        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        List<String> collect = Stream.concat(stream1, stream2).collect(Collectors.toList());
        System.out.println(collect);

    }
}
