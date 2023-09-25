package org.example.mapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {

        List<String> listVehicles = Arrays.asList("car","jeep","bicycle","truck");

        // convert to upperCase using map
        List<String> collect1 = listVehicles.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect1);

        // getting length
        listVehicles.stream().map(v->v.length()).forEach(System.out::println);

        // adding * as suffix in string
        listVehicles.stream().map(v->v.concat("*")).forEach(System.out::println);

        List<Integer> numList = Arrays.asList(4,5,8,9,6,5);

        // Square each number in given list
        numList.stream().map(n->n*n).forEach(System.out::println);

    }
}
