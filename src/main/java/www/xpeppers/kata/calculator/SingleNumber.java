package www.xpeppers.kata.calculator;

public class SingleNumber implements Calculator {

    public int sum(String stringOfNumbers) {
        return Integer.parseInt(stringOfNumbers);
    }

    public boolean canHandle(String stringOfNumbers) {
        return stringOfNumbers.matches("\\d+");
    }

}
