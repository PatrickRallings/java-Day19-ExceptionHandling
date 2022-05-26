package ValidatingParams;

public class Calculator {

    public int factorial(int num) throws IllegalArgumentException {
        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        } else {
            int answer = 1;
            for (int i = 1; i <= num; i++) {
                answer *= i;
            }
            return answer;
        }
    }

    public int binomialCoefficent(int setSize, int subsetSize) throws IllegalArgumentException {
        if (subsetSize < 0 || setSize < subsetSize) {
            throw new IllegalArgumentException("Invalid arguments entered.");
        } else {
            int numerator = factorial(setSize);
            int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);
            return numerator / denominator;
        }
    }
}