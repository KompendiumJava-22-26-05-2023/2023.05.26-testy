package pl.comarch.szkolenia.testy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void addTowPositivesTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;
        int expectedResult = 12;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void divideWithNonPointerResultTest() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        double expected = 2.0;

        double actual = calculator.divide(a, b);

        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void divideWithPointerResultTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;
        double expected = 2.5;

        double actual = calculator.divide(a, b);

        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void divideByZeroTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 0;

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(a,b));
    }
}
