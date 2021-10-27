package com.domain.lesson5;

public class Main {
    public static void main(String[] args) {
        Paint paint = new Paint();

        try {
            paint.paint("blue");
        } catch (PaintException e) {
            e.printStackTrace();
        }
    }
}
