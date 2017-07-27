import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Владислав on 23.07.2017.
 */

public class EasyCalculator {

    public static void main(String[] args) throws IOException {
        do {
            String[] expressionArgs = readOperation();
            Double result = resultNumber(expressionArgs);
            if (result != null) System.out.println(result);

        } while (repeat());
        console().close();
    }

    private static Double resultNumber(String[] expressionArgs) throws IOException {
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

    private static String[] readOperation() throws IOException {
        System.out.print("Введите ваш пример через пробел: ");
        String expression = read();
        return expression.split("\\s+");
    }

    private static boolean repeat() throws IOException {
        System.out.println("Продолжить работу? ( да / нет )");
        String nextOperation = read();
        return nextOperation.equals("да");
    }

    private static BufferedReader console() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    private static String read() throws IOException {
        return console().readLine();
    }

    private static Double operations(Double num1, String markOperation, Double num2) {
        switch (markOperation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
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
