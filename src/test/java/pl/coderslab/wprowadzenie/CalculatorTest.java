package pl.coderslab.wprowadzenie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAddPositiveNumbers() {
        // Testuje poprawność dodawania dwóch dodatnich liczb.
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAddNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(-5, -3);
        assertEquals(-8, result);
    }

    @Test
    public void testAddToMax() {
        Calculator calculator = new Calculator();
        int result = calculator.add(Integer.MAX_VALUE, 3);
        assertEquals(-2147483646, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        //Odejmowanie dwóch dodatnich liczb.
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equals 1");
        //Odejmowanie dwóch ujemnych liczb.
        assertEquals(1, calculator.subtract(-1, -2), "-1 -(-2) should equals 1");
        //Odejmowanie zera od liczby dodatniej.
        assertEquals(-1, calculator.subtract(0, 1), "0 - 1 should equals -1");
        //Odejmowanie zera od liczby ujemnej.
        assertEquals(1, calculator.subtract(0, -1), "0 -(-1) should equals 1 ");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        // Testowanie mnożenia dwóch liczb dodatnich
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal  6");
        // Testowanie mnożenia dwóch liczb ujemnych
        assertEquals(6, calculator.multiply(-2, -3), "(-2) * (-3) should equal  6");
        // Testowanie mnożenia przez zero
        assertEquals(0, calculator.multiply(5, 0), "5 * 0 should equal  0");
    }

}