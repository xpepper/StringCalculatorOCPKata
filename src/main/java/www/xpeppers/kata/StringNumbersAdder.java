package www.xpeppers.kata;

public class StringNumbersAdder {

    private String allowedDelimiters;

    public StringNumbersAdder(String allowedDelimiters) {
        this.allowedDelimiters = allowedDelimiters;
    }

    public int sum(String stringOfNumbers) throws Exception {
        String[] numbers = stringOfNumbers.split(allowedDelimiters);

        StringBuffer negatives = new StringBuffer();
        int sum = 0;
        for (String string : numbers) {
            int integer = Integer.parseInt(string);
            if (integer < 0)
                trackNegative(negatives, integer);
            sum += integer;
        }
        raiseWhenPresent(negatives);
        return sum;
    }

    private void raiseWhenPresent(StringBuffer negatives) throws Exception {
        if (!negatives.toString().isEmpty())
            throw new Exception("Negatives not allowed: " + negatives);
    }

    private void trackNegative(StringBuffer negatives, int integer) {
        if (negatives.length() > 0)
            negatives.append(", ");
        negatives.append(integer);
    }

}
