package pl.coderslab.week4.date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeekendCalculatorTest {

    @Mock
    Clock clock;


    @Test
    void shouldReturnDaysUntilWeekend(){
        LocalDate tuesday = LocalDate.of(2025,9,9);
        Instant instant = tuesday.atStartOfDay(ZoneId.systemDefault()).toInstant();
        when(clock.instant()).thenReturn(instant);
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());

        WeekendCalculator weekendCalculator = new WeekendCalculator(clock);
        long daysUntilWeekend = weekendCalculator.daysUntilWeekend();

        assertEquals(4,daysUntilWeekend);
    }

    @Test
    void shouldReturnZeroIfSaturdayOrSunday(){
        LocalDate saturday = LocalDate.of(2025,9,13);
        Instant instant = saturday.atStartOfDay(ZoneId.systemDefault()).toInstant();

        when(clock.instant()).thenReturn(instant);
        when(clock.getZone()).thenReturn(ZoneId.systemDefault());

        WeekendCalculator weekendCalculator = new WeekendCalculator(clock);
        long daysUntilWeekend = weekendCalculator.daysUntilWeekend();

        assertEquals(0,daysUntilWeekend);

    }
}