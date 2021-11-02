package com.lesson8.classwork;

public enum Season {
    Winter("Холодно"),
    Spring("Потепление"),
    Summer("Жарко"),
    Autumn("Дожди");

    private String description;

    Season(String desc) {
        description = desc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        description = desc;
    }
}
