package com.dawg.java12.teeing;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teeing2 {
    static Logger log = Logger.getLogger(Teeing2.class.getName());

    public static void main(String[] args) {
        // Returns a Collector that concatenates the input elements,separated by the
        // specified delimiter, in encounter order.
        var joiningCollector = Collectors.joining("-");

        // Returns a Collector that accumulates the input elements into anew List.
        var listCollector = Collectors.toList();

        var teeingCollector = Collectors.teeing(joiningCollector, listCollector,
                (joinedString, stringsList) -> {
                    var list = new ArrayList<>(stringsList);
                    list.add(joinedString);
                    return list.toArray(new Object[0]);
                });

        String join = Stream.of("Java", "W3schools", "blog").collect(joiningCollector);

        List list = Stream.of("Java", "W3schools", "blog").collect(listCollector);

        Object[] result = Stream.of("Java", "W3schools", "blog").collect(teeingCollector);

        log.log(Level.INFO, "Output of Collector teeing method in String[] Array : {0}",
                result);
    }
}
