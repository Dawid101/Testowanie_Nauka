package pl.coderslab.week4.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateManipulator {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public LocalDate parseStringToDate(String dateString) {
        return LocalDate.parse(dateString, formatter);
    }

    public String formatDateToString(LocalDate date) {
        return date.format(formatter);
    }

    public LocalDate addDaysToDate(LocalDate date, int daysToAdd) {
        return date.plusDays(daysToAdd);
    }

    public LocalDate subtractDaysFromDate(LocalDate date, int daysToSubtract) {
        return date.minusDays(daysToSubtract);
    }

    public boolean isFutureDate(LocalDate date) {
        return date.isAfter(LocalDate.now());
    }

    public boolean isPastDate(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }
}
