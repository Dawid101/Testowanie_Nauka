package pl.coderslab.week4.date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class DateManipulatorTest {

    private DateManipulator dateManipulator;

    @BeforeEach
    void setUp(){
        dateManipulator = new DateManipulator();
    }

    @Test
    void shouldParseStringToLocalDate(){
        LocalDate date = dateManipulator.parseStringToDate("2025-09-08");
        assertEquals(LocalDate.of(2025,9,8),date);
    }

    @Test
    void shouldParseLocalDateToString(){
        String date = dateManipulator.formatDateToString(LocalDate.of(2025,9,8));
        assertEquals("2025-09-08",date);
    }

    @Test
    void shouldAddDaysToDate(){
        LocalDate date = dateManipulator.addDaysToDate(LocalDate.of(2025,9,8),2);
        assertEquals(LocalDate.of(2025,9,10),date);
    }

    @Test
    void shouldSubtractDaysFromDate(){
        LocalDate date = dateManipulator.subtractDaysFromDate(LocalDate.of(2025,9,8),2);
        assertEquals(LocalDate.of(2025,9,6),date);
    }

    @Test
    void checkIsFutureDate(){
        assertTrue(dateManipulator.isFutureDate(LocalDate.of(2025,9,19)));
    }

    @Test
    void checkIsPastDate(){
        assertTrue(dateManipulator.isPastDate(LocalDate.of(2025,9,3)));
    }

}