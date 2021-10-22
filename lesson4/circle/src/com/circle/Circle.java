package com.circle;

public class Circle {
    Point point;

    public Circle(int x, int y) {
        this.point = new Point(x, y);
    }

    public int getX() {
        return point.getX();
    }

    public int getY() {
        return point.getY();
    }

}
