package pl.coderslab.week1.week1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.DayOfWeek;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateUtilsTest {


    public static Stream<DayOfWeek> getDay() {
        return Stream.of(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
    }

    @ParameterizedTest
    @MethodSource("getDay")
    void giveDayOfWeek_thenCheckIsWeekend(DayOfWeek day) {
        boolean expected = (day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY);
        assertEquals(expected, DateUtils.isWeekend(day));
    }

}