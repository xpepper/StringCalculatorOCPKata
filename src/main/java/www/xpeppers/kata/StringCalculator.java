package www.xpeppers.kata;

import java.util.List;

import www.xpeppers.kata.calculator.Calculator;

public class StringCalculator {

    private List<Calculator> calculators;

    public StringCalculator(List<Calculator> calculators) {
        this.calculators = calculators;
    }

    public int sum(String stringOfNumbers) {
        for (Calculator calculator : calculators) {
            if (calculator.canHandle(stringOfNumbers))
                return calculator.sum(stringOfNumbers);
        }
        return -1;
    }

}
