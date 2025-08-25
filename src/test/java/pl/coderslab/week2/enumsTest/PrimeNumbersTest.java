package pl.coderslab.week2.enumsTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    @ParameterizedTest
    @EnumSource(PrimeNumberScenario.class)
    void checkIfNumberIsPrime(PrimeNumberScenario primeNumber){
        int testNumber = primeNumber.getNumber();
        boolean result = primeNumber.getExpected();
        assertEquals(result, PrimeNumbers.isPrimeNumber(testNumber));
    }

}