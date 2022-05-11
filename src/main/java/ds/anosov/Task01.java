package ds.anosov;

import java.util.Scanner;

/**
 * Создано в рамках обучающего курса
 *
 * @author Anosov D.
 */

public class Task01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //считывает число, математический знак и второе число
        System.out.print("Введите число, математический знак и второе число: ");
        double firstNumber = scan.nextDouble();
        String mathSimbol = scan.next();
        double secondNumber = scan.nextDouble();

        if (mathSimbol.equals("+")) {
            double sum = firstNumber + secondNumber;
            System.out.printf("Ответ: " + "%.4f", + sum);
        }

        if (mathSimbol.equals("-")) {
            double min = firstNumber - secondNumber;
            System.out.printf("Ответ: " + "%.4f", + min);
        }

        if (mathSimbol.equals("/")) {
            double div = firstNumber / secondNumber;
            System.out.printf("Ответ: " + "%.4f", + div);
        }

        if (mathSimbol.equals("*")) {
            double mul = firstNumber * secondNumber;
            System.out.printf("Ответ: " + "%.4f", + mul);
        }

        if ((!(mathSimbol.equals("+"))) && (!(mathSimbol.equals("-"))) &&
                (!(mathSimbol.equals("/"))) && (!(mathSimbol.equals("*")))) {
            System.err.println("Внимание! Вы ввели не верный математический символ.");
        }
        scan.close();
    }
}
