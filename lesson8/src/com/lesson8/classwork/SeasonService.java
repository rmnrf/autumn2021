package com.lesson8.classwork;

import java.util.EnumMap;
import java.util.concurrent.Callable;

public enum SeasonService {
    INSTANCE;

    private EnumMap<Month, Callable<Season>> enumMap;

    SeasonService() {
        enumMap = new EnumMap<>(Month.class);

        for (Month month : Month.values()) {
            if (month.ordinal() == 11 || month.ordinal() == 0 || month.ordinal() == 1) {
                enumMap.put(month, () -> Season.Winter);
            } else if (month.ordinal() == 2 || month.ordinal() == 3 || month.ordinal() == 4) {
                enumMap.put(month, () -> Season.Spring);
            } else  if (month.ordinal() == 5 || month.ordinal() == 6 || month.ordinal() == 7) {
                enumMap.put(month, () -> Season.Summer);
            } else  if (month.ordinal() == 8 || month.ordinal() == 9 || month.ordinal() == 10) {
                enumMap.put(month, () -> Season.Autumn);
            }
        }
    }

    void showSeason(Month month) throws Exception {
        Season season = enumMap.get(month).call();
        System.out.printf("Время года: %s, Описание: %s\n", season.name(), season.getDescription());
    }
}
