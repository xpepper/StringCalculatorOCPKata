package www.xpeppers.kata.calculator;

import www.xpeppers.kata.StringNumbersAdder;

public class CustomDelimiterStringRule implements CalculatorRule {

    public int sum(String stringOfNumbers) throws Exception {
        String customDelimiter = stringOfNumbers.substring(2, 3);
        stringOfNumbers = stringOfNumbers.substring(5);

        return sum(stringOfNumbers, customDelimiter);
    }

    public boolean canHandle(String stringOfNumbers) {
        return stringOfNumbers.startsWith("//");
    }

    private int sum(String stringOfNumbers, String allowedDelimiters) throws Exception {
        return new StringNumbersAdder(allowedDelimiters).sum(stringOfNumbers);
    }

}
