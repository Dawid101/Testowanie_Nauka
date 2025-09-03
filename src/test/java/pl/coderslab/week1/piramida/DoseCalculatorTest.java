package pl.coderslab.week1.piramida;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class DoseCalculatorTest {

    @Test
    void calculateYoungDose() {
        DoseCalculator doseCalculator = new DoseCalculator();
        double adultDose = 200;
        double childAge = 6;
        double correctedDose = doseCalculator.calculateYoungDose(adultDose,childAge);
        BigDecimal bd = new BigDecimal(correctedDose);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double roundedNumber = bd.doubleValue();
        assertEquals(66.67,roundedNumber);
    }

    @Test
    void calculateBabyDose(){
        DoseCalculator doseCalculator = new DoseCalculator();
        double adultDose = 200;
        double childAge = 1;
        double correctedDose = doseCalculator.calculateYoungDose(adultDose,childAge);
        BigDecimal bd = new BigDecimal(correctedDose);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double roundedNumber = bd.doubleValue();
        assertEquals(15.38,roundedNumber);
    }
    @Test
    void calculateTeenageDose(){
        DoseCalculator doseCalculator = new DoseCalculator();
        double adultDose = 200;
        double childAge = 16;
        double correctedDose = doseCalculator.calculateYoungDose(adultDose,childAge);
        BigDecimal bd = new BigDecimal(correctedDose);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double roundedNumber = bd.doubleValue();
        assertEquals(114.29,roundedNumber);
    }

    @Test
    void calculateClarkDose(){
        DoseCalculator doseCalculator = new DoseCalculator();
        double adultDose = 200;
        double childAge = 40;
        double correctedDose = doseCalculator.calculateClarkDose(adultDose,childAge);
        BigDecimal bd = new BigDecimal(correctedDose);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double roundedNumber = bd.doubleValue();
        assertEquals(117.65,roundedNumber);
    }




}