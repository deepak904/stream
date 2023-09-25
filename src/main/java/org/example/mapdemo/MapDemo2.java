package org.example.mapdemo;

import org.example.Employee;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                                    new Employee(1,"Deepak Kumar",170000),
                new Employee(1,"Manish Kumar",270000),
                new Employee(1,"Rakesh Kumar",370000),
                new Employee(1,"Kittu Kumar",470000),
                new Employee(1,"Aman Kumar",150000));

        // filter and map combination
        // take out emp whose salary >150000
        employeeList.stream().filter(e->e.getSalary()>150000).map(e->e.getName()).forEach(System.out::println);
        System.out.println("___________");
        employeeList.stream().filter(emp->emp.getSalary()<200000).forEach(e->System.out.println(e.getName()));

    }
}
