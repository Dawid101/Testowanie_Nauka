package pl.coderslab.week2.enumsTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class SquareCalculatorTest {

    @ParameterizedTest
    @EnumSource(SquareScenario.class)
    void calculateSquareOfNumbers(SquareScenario number){
        int testNumber = number.input;
        int result = number.expectedOutput;
        assertEquals(result,SquareCalculator.square(testNumber));
    }

}