import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Владислав on 23.07.2017.
 */

public class EasyCalculator {

    private static BufferedReader console() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main (String[] args) throws IOException {
        boolean operationNext;

        do {
            System.out.print("Введите первое число: ");
            String numberOne = console().readLine();
            double num1 = Integer.parseInt(numberOne);

            System.out.print("Введите знак операции: ");
            String operationMark = console().readLine();
            char markOperation = operationMark.charAt(0);

            System.out.print("Введите второе число: ");
            String numberTwo = console().readLine();
            double num2 = Integer.parseInt(numberTwo);

            switch (markOperation) {
                case '+':
                    System.out.println("Ответ: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Ответ: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Ответ: " + (num1 * num2));
                    break;
                case ':':
                    if (num2 != 0) {
                        System.out.println("Ответ: " + (num1 / num2));
                    } else {
                        System.out.println("Делить на 0 нельзя!");
                    }
                    break;
            }

            System.out.println("Продолжить работу? ( да / нет )");
            String nextOperation = console().readLine();
            operationNext = (nextOperation.equals("да"));

        } while (operationNext);
        console().close();
    }
}
