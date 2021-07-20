package com.dawg.java11;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class NewStringMethods {
    static Logger log = Logger.getLogger(NewStringMethods.class.getName());

    public static void main(String... args) {
        testStrip();
    }

    private static void testIsBlank() {
        String a = "";
        if (a.isBlank()) {
            log.info("a is blank.");
        } else {
            log.info("a is not blank.");
        }
    }

    private static void testRepeat() {
        var string123 = "123";

        switch(string123.repeat(2)) {
            case "123":
                log.info("A");
                break;
            case "123123":
                log.info("B");
                break;
            case "123123123":
                log.info("C");
                break;
            default:
                log.info("None of above");
                break;
        }
    }

    private static void testStrip() {
        /*      strip
                stripLeading
                stripTrailing
        */
        String str = "  A B C  ".stripTrailing();
        switch(str) {
            case "A B C":
                log.info("1");
                break;
            case "  A B C":
                log.info("2");
                break;
            case "A B C ":
                log.info("3");
                break;
            default:
                log.info("None of above");
                break;
        }
    }

    private static void testLines() {
        String str = "A \n B \n C \n D";

        Stream<String> lines = str.lines();

        lines.forEach(entry -> System.out.println(entry));
    }
}
