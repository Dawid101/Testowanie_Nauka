package pl.coderslab.week1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateUtilsTest {


    @ParameterizedTest
    @EnumSource(DayOfWeek.class)
    void checkIfSundayAndSaturdayReturnTrue(DayOfWeek day){
        boolean expected = (day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY);
        assertEquals(expected, DateUtils.isWeekend(day));
    }

}