package com.dawg.java14.record.point;

public record Point(int x, int y) {
    public Point (int x){
        this(x, 0);
    }
}
