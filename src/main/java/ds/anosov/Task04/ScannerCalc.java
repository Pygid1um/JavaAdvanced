package ds.anosov.Task04;

import java.util.Scanner;

public class ScannerCalc {
    private static double number;
    private static String operation;

    public static double getNumber() {
        return number;
    }

    public static void setNumber(double number) {
        ScannerCalc.number = number;
    }

    public static String getOperation() {
        return operation;
    }

    public static void setOperation(String operation) {
        ScannerCalc.operation = operation;
    }

    public static double numberScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        number = scanner.nextDouble();
        return number;
    }

    public static String operationScanner() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите математический знак: ");
        operation = scanner.next();
        if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            return operation;
        }
        else {
            throw new Exception();
        }
    }
}
