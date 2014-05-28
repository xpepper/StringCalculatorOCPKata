package www.xpeppers.kata.calculator;

public class CommaAndCarriageReturnDelimitedNumbers implements Calculator {

    private static final String ALLOWED_DELIMITERS = ",|\n";

    public int sum(String stringOfNumbers) {
        SingleNumber singleNumber = new SingleNumber();

        int sum = 0;
        String[] numbers = stringOfNumbers.split(ALLOWED_DELIMITERS);
        for (String string : numbers) {
            sum += singleNumber.sum(string);
        }
        return sum;

    }

    public boolean canHandle(String stringOfNumbers) {
        return stringOfNumbers.matches("(\\d+[" + ALLOWED_DELIMITERS + "])+\\d+");
    }

}
