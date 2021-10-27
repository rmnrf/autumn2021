package com.domain.lesson5;

public class Paint implements Paintable {
    public Paint() {
    }

    public void paint(String color) throws PaintException {
        if (color != "yellow") {
            throw new PaintException("Not yellow");
        }
    }
}
