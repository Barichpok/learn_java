import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Владислав on 23.07.2017.
 */

public class EasyCalculator {

    public static void main(String[] args) throws IOException {
        boolean operationNext;

        do {
            System.out.print("Введите ваш пример: ");
            String expression = read();
            String[] expressionArgs = expression.split("\\s+");

            double num1 = Integer.parseInt(expressionArgs[0]);
            String markOperation = String.valueOf(expressionArgs[1]);
            double num2 = Integer.parseInt(expressionArgs[2]);

            Double result = operations(num1, markOperation, num2);
            if (result != null)
                System.out.println(result);

            System.out.println("Продолжить работу? ( да / нет )");
            String nextOperation = read();
            operationNext = (nextOperation.equals("да"));

        } while (operationNext);
        console().close();
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
