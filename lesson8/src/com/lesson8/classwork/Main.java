package com.lesson8.classwork;

public class Main {
    public static void main(String[] args) throws Exception {
        SeasonService instance = SeasonService.INSTANCE;

        instance.showSeason(Month.January);
        instance.showSeason(Month.February);
        instance.showSeason(Month.March);
        instance.showSeason(Month.April);
        instance.showSeason(Month.May);
        instance.showSeason(Month.June);
        instance.showSeason(Month.July);
        instance.showSeason(Month.August);
        instance.showSeason(Month.September);
        instance.showSeason(Month.October);
        instance.showSeason(Month.November);
        instance.showSeason(Month.December);
    }
}
