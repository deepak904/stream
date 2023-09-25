package org.example.usecase;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class DuplicateValue {
    public static void main(String[] args) {

        List<Student> listStd = Arrays.asList(
                new Student("Deepak",38),
                new Student("Deepak",38),
                new Student("Deepak",38),
                new Student("manish",36),
                new Student("rakesh",33));

        // method 1
        List<Map.Entry<String, Long>> collect = listStd.stream()
                .collect(Collectors.groupingBy(s -> s.getName(), Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() > 1).collect(Collectors.toList());

        // method 2
        List<Student> collect1 = listStd.stream()
                        .filter(name -> Collections.frequency(listStd.stream().map(s->s.getName())
                        .collect(Collectors.toList()), name.getName()) > 1)
                        .collect(Collectors.toList());

        int deepak = Collections.frequency(listStd.stream().map(s->s.getName()).collect(Collectors.toList()), "Deepak");
        System.out.println(deepak);

        //Map<Student, Long> collect1 = listStd.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect1);

        List<Student> listStd1 = Arrays.asList(
                new Student("Deepak",38),

                new Student("Deepak1",38),
                new Student("manish",36),
                new Student("rakesh",33));
        Map<String, Integer> countLenths = listStd1.stream().collect(Collectors.toMap(s -> s.getName(), s -> s.getName().length()));
        System.out.println(countLenths);

        List<Student> sortedStdList = listStd.stream().sorted(Comparator.comparing(Student::getName).reversed().thenComparing(Student::getAge)).collect(Collectors.toList());
        System.out.println(sortedStdList);


    }
}
