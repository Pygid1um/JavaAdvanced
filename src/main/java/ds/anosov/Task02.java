package ds.anosov;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания: 1 - Калькулятор, 2 - Строчный массив");
        int numberOfTask = scanner.nextInt();

        //калькулятор
        if (numberOfTask == 1) {
            System.out.println("Вы выбрали задание \"Калькулятор\"");
            System.out.print("Введите число, математический знак и второе число: ");
            double firstNumber = scanner.nextDouble();
            String mathSimbol = scanner.next();
            double secondNumber = scanner.nextDouble();

            if (mathSimbol.equals("+")) {
                double sum = firstNumber + secondNumber;
                System.out.printf("Ответ: " + "%.4f", +sum);
            }

            if (mathSimbol.equals("-")) {
                double min = firstNumber - secondNumber;
                System.out.printf("Ответ: " + "%.4f", +min);
            }

            if (mathSimbol.equals("/")) {
                double div = firstNumber / secondNumber;
                System.out.printf("Ответ: " + "%.4f", +div);
            }

            if (mathSimbol.equals("*")) {
                double mul = firstNumber * secondNumber;
                System.out.printf("Ответ: " + "%.4f", +mul);
            }

            if ((!(mathSimbol.equals("+"))) && (!(mathSimbol.equals("-"))) &&
                    (!(mathSimbol.equals("/"))) && (!(mathSimbol.equals("*")))) {
                System.err.println("Внимание! Вы ввели не верный математический символ.");
            }
        }

        //массив строк
        String maxLengthOfWord = null;
        int maxLengthOfElement = 0;
        if (numberOfTask == 2) {
            System.out.println("Вы выбрали задание \"Строчный массив\".");
            System.out.println("Задайте размерность массива строк: ");
            int lengthOfArray = scanner.nextInt();
            String[] arrayOfWords = new String[lengthOfArray];

            for (int i = 0; i < arrayOfWords.length; i++) {
                System.out.println("Введите " + (i + 1) + " слово: ");
                String fillOfArray = scanner.next();
                arrayOfWords[i] = fillOfArray;
                if (arrayOfWords[i].length() > maxLengthOfElement) {
                    maxLengthOfElement = arrayOfWords[i].length();
                    maxLengthOfWord = arrayOfWords[i];
                }
            }
        System.out.println("Самое длинное слово: " + maxLengthOfWord);
        System.out.println("Количество символов в этом слове: " + maxLengthOfElement);

        }

        scanner.close();
    }
}
