package com.dawg.java14.nullpointerexception;

public class NullPointerExceptionTesting {

    public static void main(String[] arguments) {
        if ((new A()).b.c.getNumber().equals(1)) {
            System.out.println("number is 1");
        }
    }
}

/*
    Exception in thread "main" java.lang.NullPointerException
        at nullpointerexception.NullPointerExceptionTesting.main(NullPointerExceptionTesting.java:6)
*/
