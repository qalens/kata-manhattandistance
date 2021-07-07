package com.qalens.md;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceFrom(Point b) {
        return Math.abs(x-b.x);
    }
}
