package maintest;

import static main.SimpleCalculatorLogic.addMe;
import static main.SimpleCalculatorLogic.subtractMe;
import static main.SimpleCalculatorLogic.multiplyValues;
import static main.SimpleCalculatorLogic.divideValues;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.Main;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testMainClass() {
        Main.main(new String[]{});
    }
    @Test
    public void testMainMethodCoverage() {
        String[] args = {};
        Main.main(args);
    }
    @Test
    public void testAddMePositiveNumbers() {
        assertEquals(16, addMe(12, 4));
    }
    @Test
    public void testAddMeZero() {
        assertEquals(4, addMe(0, 4));
        assertEquals(12, addMe(12, 0));
    }

    @Test
    public void testAddMeNegativeNumbers() {
        assertEquals(-16, addMe(-11, -5));
    }

    @Test
    public void testAddMePositiveAndNegative() {
        assertEquals(8, addMe(12, -4));
    }
    @Test
    public void testAddMeLargeNumbers() {
        assertEquals(3000000, addMe(1500000, 1500000));
    }

    @Test
    public void testSubtractMePositiveNumbers() {
        assertEquals(8, subtractMe(12, 4));
    }

    @Test
    public void testSubtractMeNegativeNumbers() {
        assertEquals(-8, subtractMe(-12, -4));
    }

    @Test
    public void testSubtractMeMixedNumbers() {
        assertEquals(16, subtractMe(12, -4));
    }

    @Test
    public void testSubtractMeZero() {
        assertEquals(12, subtractMe(12, 0));
        assertEquals(-4, subtractMe(0, 4));
    }

    @Test
    public void testMultiplyValuesPositiveNumbers() {
        assertEquals(48, multiplyValues(12, 4));
    }

    @Test
    public void testMultiplyValuesWithZero() {
        assertEquals(0, multiplyValues(12, 0));
        assertEquals(0, multiplyValues(0, 4));
    }

    @Test
    public void testMultiplyValuesNegativeNumbers() {
        assertEquals(48, multiplyValues(-12, -4));
        assertEquals(-48, multiplyValues(12, -4));
    }

    @Test
    public void testDivideValuesPositiveNumbers() {
        assertEquals(3, divideValues(12, 4));
    }

    @Test
    public void testDivideValuesNegativeNumbers() {
        assertEquals(3, divideValues(-12, -4));
        assertEquals(-3, divideValues(12, -4));
    }

    @Test
    public void testDivideValuesWithZeroNumerator() {
        assertEquals(0, divideValues(0, 4));
    }
    @Test
    public void testDivideValuesByZero() {
        assertEquals(0, divideValues(12, 0));
    }
    @Test
    public void testSubtractMeZeroFromZero() {
        assertEquals(0, subtractMe(0, 0));
    }
    @Test
    public void testSubtractMeLargeNegativeNumbers() {
        assertEquals(-3000000, subtractMe(-1000000, 2000000));
    }

    @Test
    public void testMultiplyValuesByOne() {
        assertEquals(12, multiplyValues(12, 1));
        assertEquals(-12, multiplyValues(-12, 1));
    }
    @Test
    public void testMultiplyValuesByNegativeOne() {
        assertEquals(-12, multiplyValues(12, -1));
        assertEquals(12, multiplyValues(-12, -1));
    }

    @Test
    public void testMultiplyValuesLargeNumbers() {
        assertEquals(2000000 * 1000000, multiplyValues(2000000, 1000000));
    }

    @Test
    public void testDivideValuesNonExactDivision() {
        assertEquals(3, divideValues(7, 2));
    }

    @Test
    public void testDivideValuesSmallNumerator() {
        assertEquals(0, divideValues(1, 4));
    }

}
