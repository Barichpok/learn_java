package calculator;

import calculator.operations.Addition;
import calculator.operations.Division;
import calculator.operations.Multiplication;
import calculator.operations.Subtraction;

import java.io.IOException;

class Operations {

    Double getResultNumber(String[] expressionArgs) throws IOException {
        if (expressionArgs.length == 3) {
            double num1 = Integer.parseInt(expressionArgs[0]);
            String markOperation = String.valueOf(expressionArgs[1]);
            double num2 = Integer.parseInt(expressionArgs[2]);
            return operations(num1, markOperation, num2);
        } else {
            System.out.println("Введи пример через пробел!");
        }
        return null;
    }

    private Double operations(Double num1, String markOperation, Double num2) {
        switch (markOperation) {
            case "+":
                return Addition.getCalculationResult();
            case "-":
                return Subtraction.getCalculationResult();
            case "*":
                return Multiplication.getCalculationResult();
            case "/":
                if (num2 != 0) {
                    return Division.getCalculationResult();
                } else {
                    System.out.println("Делить на 0 нельзя!");
                }
                break;
            default:
                System.out.println("Неверная операция!");
                break;
        }
        return null;
    }
}
