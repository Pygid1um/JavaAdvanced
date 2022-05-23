package ds.anosov;

import ds.anosov.Task04.Calculation;
import ds.anosov.Task04.ScannerCalc;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Task07Tests {

    @Test
    @DisplayName("Проверка суммирования положительных чисел")
    public void checkingSummationOfPositiveNumbers() {
        Calculation.setFirstNumber(2);
        Calculation.setSecondNumber(5);
        Assertions.assertEquals(7, Calculation.sum());
    }

    @Test
    @DisplayName("Проверка суммирования отрицательных чисел")
    public void checkingSummationOfNegativeNumbers() {
        Calculation.setFirstNumber(-6);
        Calculation.setSecondNumber(-777);
        Assertions.assertEquals(-783, Calculation.sum());
    }

    @Test
    @DisplayName("Проверка разности положительных чисел")
    public void checkingSubtractionOfPositiveNumbers() {
        Calculation.setFirstNumber(76);
        Calculation.setSecondNumber(45);
        Assertions.assertEquals(31, Calculation.subtraction());
    }

    @Test
    @DisplayName("Проверка разности отрицательных чисел")
    public void checkingSubtractionOfNegativeNumbers() {
        Calculation.setFirstNumber(-5);
        Calculation.setSecondNumber(-6);
        Assertions.assertEquals(1, Calculation.subtraction());
    }

    @Test
    @DisplayName("Проверка деления положительных чисел")
    public void checkingDivisionOfPositiveNumbers() {
        Calculation.setFirstNumber(100);
        Calculation.setSecondNumber(10);
        Assertions.assertEquals(10.0, Calculation.division());
    }

    @Test
    @DisplayName("Проверка деления отрицательных чисел")
    public void checkingDivisionOfNegativeNumbers() {
        Calculation.setFirstNumber(-50);
        Calculation.setSecondNumber(-5);
        Assertions.assertEquals(10.0, Calculation.division());
    }

    @Test
    @DisplayName("Проверка умножения положительных чисел")
    public void checkingMultiplicationOfPositiveNumbers() {
        Calculation.setFirstNumber(77);
        Calculation.setSecondNumber(5);
        Assertions.assertEquals(385.0, Calculation.multiplication());
    }

    @Test
    @DisplayName("Проверка умножения отрицательных чисел")
    public void checkingMultiplicationOfNegativeNumbers() {
        Calculation.setFirstNumber(-50);
        Calculation.setSecondNumber(-5);
        Assertions.assertEquals(250.0, Calculation.multiplication());
    }

    @Test
    @DisplayName("Проверка деления на 0")
    public void testDivisionZero() {
        Calculation.setFirstNumber(2);
        Calculation.setSecondNumber(0);
        assertThrows(ArithmeticException.class, () ->
                 Calculation.division(), "Внимание! Вы ввели не 0");
    }

    @Test
    @DisplayName("Проверка ввода")
    public void testType() {
        Calculation.setFirstNumber(2.8);
        Calculation.setSecondNumber(3);

        assertThrows(Exception.class, () ->
                ScannerCalc.numberScanner(), "Вы ввели не корректное число!");
    }

}
