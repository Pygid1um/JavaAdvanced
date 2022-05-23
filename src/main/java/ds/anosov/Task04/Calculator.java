package ds.anosov.Task04;

import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {

        try {
            Calculation calculation = new Calculation(ScannerCalc.numberScanner(), ScannerCalc.numberScanner());

            switch (ScannerCalc.operationScanner()) {
                case "+":
                    System.out.printf("Сумма ваших чисел: " + "%.4f", Calculation.sum());
                    break;

                case "-":
                    System.out.printf("Разность ваших чисел: " + "%.4f", Calculation.subtraction());
                    break;

                case "/":
                    System.out.printf("Частное ваших чисел: " + "%.4f", Calculation.division());
                    break;

                case "*":
                    System.out.printf("Умножение ваших чисел: " + "%.4f", Calculation.multiplication());
                    break;
            }
        } catch (InputMismatchException e) {
            System.err.println("Внимание! Вы ввели не корректное число! " + e);
            e.printStackTrace();
        }
        catch (ArithmeticException e1) {
            System.err.println("Внимание! Делить на 0 нельзя! \n" + e1);
            e1.printStackTrace();
        }
        catch (Exception e2) {
            System.err.println("Внимание! Вы ввели не корректный математический оператор! " + e2);
            e2.printStackTrace();
        }
    }
}
