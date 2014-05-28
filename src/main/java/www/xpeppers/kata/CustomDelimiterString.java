package www.xpeppers.kata;

import www.xpeppers.kata.calculator.Calculator;

public class CustomDelimiterString implements Calculator {

    public int sum(String stringOfNumbers) {
        String customDelimiter = stringOfNumbers.substring(2, 3);
        stringOfNumbers = stringOfNumbers.substring(5);

        return sum(stringOfNumbers, customDelimiter);
    }

    public boolean canHandle(String stringOfNumbers) {
        return stringOfNumbers.startsWith("//");
    }

    private int sum(String stringOfNumbers, String allowedDelimiters) {
        return new StringNumbersAdder(allowedDelimiters).sum(stringOfNumbers);
    }

}
