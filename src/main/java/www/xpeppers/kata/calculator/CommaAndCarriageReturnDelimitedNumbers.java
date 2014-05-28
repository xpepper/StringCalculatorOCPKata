package www.xpeppers.kata.calculator;

import www.xpeppers.kata.StringNumbersAdder;

public class CommaAndCarriageReturnDelimitedNumbers implements Calculator {

    public int sum(String stringOfNumbers) {
        return sum(stringOfNumbers, ",|\n");
    }

    public boolean canHandle(String stringOfNumbers) {
        return stringOfNumbers.matches("(\\d+[" + ",|\n" + "])+\\d+");
    }

    private int sum(String stringOfNumbers, String allowedDelimiters) {
        return new StringNumbersAdder(allowedDelimiters).sum(stringOfNumbers);
    }


}
