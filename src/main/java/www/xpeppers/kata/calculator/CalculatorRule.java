package www.xpeppers.kata.calculator;

public interface CalculatorRule {

    int sum(String stringOfNumbers) throws Exception;

    boolean canHandle(String stringOfNumbers);

}