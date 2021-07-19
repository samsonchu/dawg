package com.dawg.java14.record.point;

public class Test {

    static public void main(String... args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        Point point3 = new Point(5);

        System.out.println(point1.x());
        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));

        System.out.println(point2.equals(point3));
    }
}
