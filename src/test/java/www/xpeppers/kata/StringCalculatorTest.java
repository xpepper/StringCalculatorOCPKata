package www.xpeppers.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void emptyStringIsZero() {
        assertEquals(0, sum(""));
    }

    @Test
    public void numberAsStringIsTheNumberItself() {
        assertEquals(3, sum("3"));
    }

    @Test
    public void commaDelimitedNumbersAddsToTheSumOfTheNumbers() {
        assertEquals(6, sum("1,2,3"));
    }

    @Test
    public void commasAndCarrigeReturnsAreValidDelimiters() {
        assertEquals(6, sum("1,2\n3"));
    }

    private int sum(String stringOfNumbers) {
        StringCalculator calculator = StringCalculatorFactory.create();
        return calculator.sum(stringOfNumbers);
    }


}
