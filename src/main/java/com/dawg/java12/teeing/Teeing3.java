package com.dawg.java12.teeing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Teeing3 {
    static Logger log = Logger.getLogger(Teeing3.class.getName());
    public static final List<Employee> EMPLOYEE_LIST = Arrays.asList(
            new Employee(1, "A", 100),
            new Employee(2, "B", 200),
            new Employee(3, "C", 300),
            new Employee(4, "D", 400));

    public static void main(String... args) {
        mapWithMaxAndMin();
    }

    private static void mapWithMaxAndMin() {

        Collector<Employee, ?, Optional<Employee>> maxStream = Collectors.maxBy(Comparator.comparing(Employee::getSalary));
        Collector<Employee, ?, Optional<Employee>> minSream = Collectors.minBy(Comparator.comparing(Employee::getSalary));
        Collector<Employee, ?, HashMap<String, Employee>> teeing = Collectors.teeing(
                maxStream, // downstream collector1
                minSream, // downstream collector2
                // function
                (max, min) -> {
                    HashMap<String, Employee> map = new HashMap();
                    map.put("MAX", max.get());
                    map.put("MIN", min.get());
                    return map;
                }
        );

        HashMap<String, Employee> result = EMPLOYEE_LIST.stream().collect(
                teeing);
        log.info(result.toString());
    }
}
