package www.xpeppers.kata.calculator;

public class EmptyStringRule implements CalculatorRule {

    public boolean canHandle(String stringOfNumbers) {
        return stringOfNumbers.isEmpty();
    }

    public int sum(String stringOfNumbers) {
        return 0;
    }

}
