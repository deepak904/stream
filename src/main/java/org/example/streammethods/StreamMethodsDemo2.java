package org.example.streammethods;

import java.util.HashSet;
import java.util.Set;

// anyMatch()
// allMatch()
// nonMatch()
public class StreamMethodsDemo2 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("More grapes");
        fruits.add("Two guavas");

        // anyMatch()
        // at least one value match then return true else false
        boolean anyMatch = fruits.stream().anyMatch(s -> s.startsWith("One"));
        System.out.println(anyMatch); // true

        // allMatch()
        // all should match with One
        boolean allMatch = fruits.stream().allMatch(s -> s.startsWith("One"));
        System.out.println(allMatch); // false

        // noneMatch()
        // opposite of allMatch()
        boolean noneMatch = fruits.stream().noneMatch(s -> s.startsWith("One"));
        System.out.println(noneMatch);
    }
}
