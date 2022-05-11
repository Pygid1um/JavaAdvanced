package ds.anosov.Task04;

public class Calculation {
    private static double firstNumber;
    private static double secondNumber;

    public Calculation(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static double getFirstNumber() {
        return firstNumber;
    }

    public static void setFirstNumber(double firstNumber) {
        Calculation.firstNumber = firstNumber;
    }

    public static double getSecondNumber() {
        return secondNumber;
    }

    public static void setSecondNumber(double secondNumber) {
        Calculation.secondNumber = secondNumber;
    }

    public static double sum() {
        return firstNumber + secondNumber;
    }

    public static double subtraction() {
        return firstNumber - secondNumber;
    }

    public static double multiplication() {
        return firstNumber * secondNumber;
    }

    public static Object division() {
        if (secondNumber == 0) {
            throw new ArithmeticException();
        } else {
            return firstNumber / secondNumber;
        }
    }
}
