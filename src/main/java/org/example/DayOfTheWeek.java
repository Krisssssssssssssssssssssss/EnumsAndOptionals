package org.example;

public enum DayOfTheWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public static String getDayOfTheWeek(DayOfTheWeek dayOfTheWeek) {
        if (dayOfTheWeek == SATURDAY || dayOfTheWeek == SUNDAY) {
            return "WEEKEND";
        }
        else {
            return dayOfTheWeek.name();
        }
    }
}
