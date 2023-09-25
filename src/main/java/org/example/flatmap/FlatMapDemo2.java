package org.example.flatmap;


import org.example.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
    public static void main(String[] args) {

        List<Employee> employeeList1 = Arrays.asList(
                new Employee(1,"Deepak Kumar",170000),
                new Employee(1,"Manish Kumar",270000) );

        List<Employee> employeeList2 = Arrays.asList(
                new Employee(1,"Rakesh Kumar",370000),
                new Employee(1,"Kittu Kumar",470000),
                new Employee(1,"Aman Kumar",150000));

        List<List<Employee>> listAllEmp = Arrays.asList(employeeList1,employeeList2);

        // retrieve all name of employees
        List<String> listNameEmp = listAllEmp.stream()
                                    .flatMap(s -> s.stream().map(s1 -> s1.getName()))
                                    .collect(Collectors.toList());

        List<String> listNameEmp2 = listAllEmp.stream()
                                                .flatMap(s->s.stream())
                                                .map(sn->sn.getName())
                                                .collect(Collectors.toList());
        System.out.println(listNameEmp2);
    }
}
