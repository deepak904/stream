package org.example.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentExpDemo {

    public static void main(String[] args) {

        List<String> listString = new ArrayList<>(Arrays.asList("Manish","Deepak"));

        Iterator<String> iterator =listString.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if (name.equals("Manish")){
                iterator.remove();

            }
        }
        System.out.println(listString);

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> iterator1 = names.iterator();

        while (iterator1.hasNext()) {
            String name = iterator1.next();
            if (name.equals("Bob")) {
                // Attempting to modify the list while iterating
                names.remove(name); // This will throw ConcurrentModificationException
            }
        }
        System.out.println(names);


    }
}


