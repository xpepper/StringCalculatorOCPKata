package www.xpeppers.kata;

import www.xpeppers.kata.calculator.CalculatorRule;

public class StringCalculator {

    private CalculatorRule[] rules;

    public StringCalculator(CalculatorRule... rules) {
        this.rules = rules;
    }

    public int sum(String stringOfNumbers) throws Exception {
        for (CalculatorRule rule : rules) {
            if (rule.canHandle(stringOfNumbers))
                return rule.sum(stringOfNumbers);
        }
        return -1;
    }

}
