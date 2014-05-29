package www.xpeppers.kata;

import www.xpeppers.kata.calculator.CommaAndCarriageReturnDelimitedNumbersRule;
import www.xpeppers.kata.calculator.CustomDelimiterStringRule;
import www.xpeppers.kata.calculator.EmptyStringRule;

public class StringCalculatorFactory {

    public static StringCalculator create() {
        return new StringCalculator(
                    new CustomDelimiterStringRule(),
                    new CommaAndCarriageReturnDelimitedNumbersRule(),
                    new EmptyStringRule()
                  );
    }

}
