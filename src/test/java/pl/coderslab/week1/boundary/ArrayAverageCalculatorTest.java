package pl.coderslab.week1.boundary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAverageCalculatorTest {

    @Test
    void giveEmptyArray_whenCalculateAverage_thenReturnZero() {
        //give
        int[] array = {};

        //when
        double result = ArrayAverageCalculator.calculateAverage(array);

        //then
        assertEquals(0,result);
    }

    @Test
    void giveNegativeNumberArray_whenCalculateAverage_thenReturnAvg(){
        //give
        int[] array = {-1,-2,-5,-3};

        //when
        double result = ArrayAverageCalculator.calculateAverage(array);

        //then
        assertEquals(-2.75,result);
    }

    @Test
    void givenNegativeAndPositiveNumberArray_whenCalculateAverage_thenReturnAvg(){
        //give
        int[] array = {-1,2,5,-3};

        //when
        double result = ArrayAverageCalculator.calculateAverage(array);

        //then
        assertEquals(0.75,result);
    }
}