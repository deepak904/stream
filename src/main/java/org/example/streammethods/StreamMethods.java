package org.example.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethods {

    // Non-terminal methods (Processing methods) - distinct(), limit(), filter(), map(),
    // Terminal methods - count(), forEach(), min(), max(), collect(), toArray()
    public static void main(String[] args) {

        List<String> listVehicles = Arrays.asList("car","jeep","bicycle","truck","car","jeep");

        // distinct()
        // find distinct vehicles list
        List<String> distinctList = listVehicles.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        // display using forEach methods
        listVehicles.stream().distinct().forEach(System.out::println);

        // limit()
        // find first three vehicles of given list
        listVehicles.stream().limit(3).forEach(System.out::println);

        List<Integer> listNumber = Arrays.asList(1,2,4,6,7,5,25,34,64);

        // find count of even number in listNumber collection
        long countEvenNum = listNumber.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Event number count :"+ countEvenNum);

        // min()
        Optional<Integer> min = listNumber.stream().min((num1, num2) -> {
            return num1.compareTo(num2);
        });
        System.out.println("Min number in given list is :"+ min.get());

        // max()
        Optional<Integer> max = listNumber.stream().max((num1, num2) -> {
            return num1.compareTo(num2);
        });
        System.out.println("max number in given list is :"+ max.get());

        // reduce()
        Optional<Integer> sumNum = listNumber.stream().reduce((n1, n2) -> {
            return n1 + n2;
        });
        System.out.println("Sum of numbers :"+sumNum.get());

        // real example of reduce
        // counting of votes of different places

        // toArray()
        // convert stream to array
        Object[] array = listNumber.toArray();
        System.out.println(Arrays.toString(array));

    }
}
