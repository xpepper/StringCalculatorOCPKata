package www.xpeppers.kata;

import www.xpeppers.kata.calculator.SingleNumber;

public class StringNumbersAdder {

    private String allowedDelimiters;

    public StringNumbersAdder(String allowedDelimiters) {
        this.allowedDelimiters = allowedDelimiters;
    }

    public int sum(String stringOfNumbers) {
        SingleNumber singleNumber = new SingleNumber();
        int sum = 0;
        String[] numbers = stringOfNumbers.split(allowedDelimiters);
        for (String string : numbers) {
            sum += singleNumber.sum(string);
        }
        return sum;
    }

}
