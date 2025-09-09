package pl.coderslab.week4.date;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WeekendCalculator {
    private final Clock clock;

    public WeekendCalculator(Clock clock) {
        this.clock = clock;
    }

    public long daysUntilWeekend() {
        LocalDate currentDate = LocalDate.now(clock);
        DayOfWeek currentDayOfWeek = currentDate.getDayOfWeek();

        if (currentDayOfWeek == DayOfWeek.SATURDAY || currentDayOfWeek == DayOfWeek.SUNDAY) {
            return 0; // Return 0 days if today is Saturday or Sunday
        } else {
            DayOfWeek nextSaturday = currentDayOfWeek;
            while (nextSaturday != DayOfWeek.SATURDAY) {
                nextSaturday = nextSaturday.plus(1);
            }
            return ChronoUnit.DAYS.between(currentDate, currentDate.with(nextSaturday));
        }
    }
}
