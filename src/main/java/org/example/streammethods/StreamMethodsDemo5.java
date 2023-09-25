package org.example.streammethods;

// parallelStream()

import java.util.Arrays;
import java.util.List;

class Student {
    int marks;
    String name;

    public Student(String name, int marks) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

public class StreamMethodsDemo5 {

    public static void main(String[] args) {
        List<Student> listStudents = Arrays.asList(
                new Student("David", 82),
                new Student("Mand", 90),
                new Student("Pary", 60),
                new Student("Ram", 65),
                new Student("Sam", 55),
                new Student("Dev", 85),
                new Student("Mary", 88),
                new Student("Kery", 50));

        // using stream() - sequential
        listStudents.stream()
                .filter(s -> s.getMarks() > 80)
                .limit(80)
                .forEach(std -> System.out.println(std.getName() + " " + std.getMarks()));

        // using parallelStream() - do it parallel
        listStudents.parallelStream()
                .filter(s -> s.getMarks() > 80)
                .limit(80)
                .forEach(std -> System.out.println(std.getName() + " " + std.getMarks()));

        // convert stream() to parallelStream()
        listStudents.stream().parallel()
                .filter(s -> s.getMarks() > 80)
                .limit(80)
                .forEach(std -> System.out.println(std.getName() + " " + std.getMarks()));
    }
}
