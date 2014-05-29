package www.xpeppers.kata.calculator;

import www.xpeppers.kata.StringNumbersAdder;

public class CommaAndCarriageReturnDelimitedNumbersRule implements CalculatorRule {

    public int sum(String stringOfNumbers) throws Exception {
        return doSum(stringOfNumbers, ",|\n");
    }

    public boolean canHandle(String stringOfNumbers) {
        return stringOfNumbers.split(",|\n").length >= 1;
    }

    private int doSum(String stringOfNumbers, String allowedDelimiters) throws Exception {
        return new StringNumbersAdder(allowedDelimiters).sum(stringOfNumbers);
    }


}
