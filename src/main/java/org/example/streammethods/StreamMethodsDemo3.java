package org.example.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// findAny()
// findFirst()
public class StreamMethodsDemo3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "four", "one", "two");
        List<String> emptyList = Arrays.asList();

        Optional<String> anyEle = stringList.stream().findAny();
        System.out.println(anyEle.get());

        Optional<String> anyEmpty = emptyList.stream().findAny();
        System.out.println(anyEmpty.get());


    }
}
