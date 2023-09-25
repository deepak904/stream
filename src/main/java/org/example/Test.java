package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        System.out.println(isAnagram("geeksforgeeks","forgeeksgeeks"));

        String s ="Deepak";
        char[] charArray = s.toCharArray();

        Stream<Character> s1 = new String(charArray).chars().mapToObj(i->(char)i);

        Map<Character, Long> collect = new String(charArray).chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        collect.entrySet().stream().filter(n->n.getValue()>1).forEach(System.out::println);

        Map<Character, Long> collect2 = collect.entrySet().stream().filter(n -> n.getValue() > 1).collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
        System.out.println(collect2);

        // s1.forEach(System.out::println);

    }

  static   boolean isAnagram(String str1, String str2){
        if (str1.length()!=str2.length()){
            return false;
        }



        String[] strA1 = str1.split("");
        String[] strA2 = str2.split("");

        Arrays.sort(strA1);
        Arrays.sort(strA2);

        return Arrays.equals(strA1,strA2);


    }
}
