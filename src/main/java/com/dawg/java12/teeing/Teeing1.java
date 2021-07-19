package com.dawg.java12.teeing;

import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teeing1 {
    static Logger log = Logger.getLogger(Teeing1.class.getName());

    public static void main(String... args) {
        average();
    }

    private static void average() {
        Integer[] integers = {1, 2, 3, 6};

        Collector<Integer, ?, Double> summingDouble = Collectors.summingDouble(i -> i);

        Collector<Integer, ?, Long> counting = Collectors.counting();

        Collector<Integer, ?, Double> teeing = Collectors.teeing(
                summingDouble, // downstream collector1
                counting,      // downstream collector2
                (sum, count) -> sum / count       // merge function
        );

        double average = Stream.of(integers)
                .collect(teeing);

        log.info("average: " + average);
    }
}
