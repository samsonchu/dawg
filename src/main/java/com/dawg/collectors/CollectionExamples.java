package com.dawg.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

public class CollectionExamples {

    public static void main(String... args) {
        List<String> givenList = Arrays.asList("a", "bb", "bb", "ccc", "dd");
        Set<String> newSet = givenList.stream()
                .collect(toSet());

        Map<String, Integer> newMap = givenList.stream()
                .collect(toMap(Function.identity(), String::length, (item, identicalItem) -> item));

        System.out.println(newMap);
        System.out.println(newMap.get("a").getClass());
    }
}
