package www.xpeppers.kata;

import static java.util.Arrays.*;

import java.util.List;

import www.xpeppers.kata.calculator.Calculator;
import www.xpeppers.kata.calculator.CommaAndCarriageReturnDelimitedNumbers;
import www.xpeppers.kata.calculator.EmptyString;
import www.xpeppers.kata.calculator.SingleNumber;

public class StringCalculatorFactory {

    public static StringCalculator create() {
        List<Calculator> calculators = asList(new CommaAndCarriageReturnDelimitedNumbers(), new SingleNumber(), new EmptyString());
        return new StringCalculator(calculators);
    }

}
