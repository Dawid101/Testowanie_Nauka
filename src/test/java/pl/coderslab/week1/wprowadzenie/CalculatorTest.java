package pl.coderslab.week1.wprowadzenie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.coderslab.exceptions.NegativeNumberException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAddPositiveNumbers() {
        // Testuje poprawność dodawania dwóch dodatnich liczb.
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAddNegativeNumbers() {
        int result = calculator.add(-5, -3);
        assertEquals(-8, result);
    }

    @Test
    public void testAddToMax() {
        assertThrows(ArithmeticException.class, () -> calculator.add(Integer.MAX_VALUE, 3));
    }

    @Test
    public void testSubtract() {
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
        // Testowanie mnożenia dwóch liczb dodatnich
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal  6");
        // Testowanie mnożenia dwóch liczb ujemnych
        assertEquals(6, calculator.multiply(-2, -3), "(-2) * (-3) should equal  6");
        // Testowanie mnożenia przez zero
        assertEquals(0, calculator.multiply(5, 0), "5 * 0 should equal  0");
    }

    @Test
    void negativeNumberShouldThrowIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> Calculator.factorial(-2));
    }

    @Test
    void negativeNumberShouldThrowNegativeNumberException(){
        assertThrows(NegativeNumberException.class , () -> Calculator.square(-1));
        assertThrows(NegativeNumberException.class , () -> Calculator.square(-3));
        assertThrows(NegativeNumberException.class , () -> Calculator.square(-102));
    }

    @AfterEach
    void cleanUp(){
        calculator = null;
    }

}