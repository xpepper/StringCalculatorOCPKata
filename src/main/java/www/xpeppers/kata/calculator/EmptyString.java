package www.xpeppers.kata.calculator;

public class EmptyString implements Calculator {

    public boolean canHandle(String stringOfNumbers) {
        return stringOfNumbers.isEmpty();
    }

    public int sum(String stringOfNumbers) {
        return 0;
    }

}
