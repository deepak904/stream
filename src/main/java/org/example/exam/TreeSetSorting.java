package org.example.exam;

import java.util.*;

public class TreeSetSorting {
    public static void main(String[] args) {
        Set<Integer> t = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        t.add(45);
        t.add(5);
        t.add(50);
        System.out.println(t);

        Set<String> t1 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer l1 = o1.length();
                Integer l2 = o2.length();
                if (l1>l2) return -1;
                if (l1<l2) return +1;
                if (l1 == l2){
                    return o1.compareTo(o2);
                }
                return 0;
            }
        });
        t1.add("Deepak");
        t1.add("Abcdef");
        t1.add("Manish");
        t1.add("Ram");
        t1.add("slly");
        System.out.println(t1);

        Map<Character,Integer> m= new HashMap<>();
        String strNames = "deepakkumar";
        for(char c:strNames.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> v: m.entrySet()){
            if (v.getValue()>1){
                System.out.println(v.getKey());
            }

        }
        System.out.println(m);


        String inputString = "xxyxz";
        char targetChar = 'x';

        // Find all occurrences of the target character
        int[] charPositions = new int[inputString.length()];
        int charCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                charPositions[charCount] = i;
                charCount++;
            }
        }

        // Calculate distances between occurrences
        System.out.println("Distances between occurrences of '" + targetChar + "':");
        for (int i = 0; i < charCount - 1; i++) {
            int distance = charPositions[i + 1] - charPositions[i];
            System.out.println("From position " + charPositions[i] + " to position " + charPositions[i + 1] + ": " + distance + " characters");
        }
    }

}

class myDescComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
