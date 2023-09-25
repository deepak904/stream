package org.example.filterdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {

        List<String> listName = Arrays.asList("deepak", null, "manish", "rakesh", null, "kittu","kittu");

        // removing null from list of names
        listName.stream().filter(s->s != null).forEach(System.out::println);

        // removing null from list of names
        List<String> namesWithoutNull = listName.stream().filter(s-> s!=null).collect(Collectors.toList());
        System.out.println(namesWithoutNull);

        // removing null from list of names and removing duplicates
        namesWithoutNull.stream().distinct().filter(s->s !=null).forEach(System.out::println);

        // counting null values
        System.out.println(namesWithoutNull.stream().count());
    }
}
