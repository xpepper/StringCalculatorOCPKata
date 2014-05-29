package www.xpeppers.kata;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void emptyStringIsZero() throws Exception {
        assertEquals(0, sum(""));
    }

    @Test
    public void numberAsStringIsTheNumberItself() throws Exception {
        assertEquals(3, sum("3"));
    }

    @Test
    public void commaDelimitedNumbersAddsToTheSumOfTheNumbers() throws Exception {
        assertEquals(6, sum("1,2,3"));
    }

    @Test
    public void commasAndCarrigeReturnsAreValidDelimiters() throws Exception {
        assertEquals(6, sum("1,2\n3"));
    }

    @Test
    public void customDelimiterInTheHeaderOfTheString() throws Exception {
        assertEquals(6, sum("//;\\n1;2;3"));
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void raiseExceptionWithNegativeNumbers() throws Exception {
        expectedException.expectMessage("Negatives not allowed: -2, -3");
        sum("1,-2,-3");
    }

    @Test
    public void raiseExceptionWithSingleNegativeNumber() throws Exception {
        expectedException.expectMessage("Negatives not allowed: -1");
        sum("-1");
    }

    private int sum(String stringOfNumbers) throws Exception {
        StringCalculator calculator = StringCalculatorFactory.create();
        return calculator.sum(stringOfNumbers);
    }

}
