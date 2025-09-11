package pl.coderslab.week5.tdd;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorsTest {

    @Test
    void shouldGeneratePrimeFactors(){
        List<Integer> dividers = Factors.generatePrimeFactors(12);
        assertEquals(3, dividers.size());
    }
}
