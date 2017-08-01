package Calculator;

import java.io.IOException;

class Other {

    static String[] readOperation() throws IOException {
        System.out.print("Введите ваш пример через пробел: ");
        String expression = read();
        return expression.split("\\s+");
    }

    static boolean repeat() throws IOException {
        System.out.println("Продолжить работу? ( да / нет )");
        String nextOperation = read();
        return ("да").equals(nextOperation);
    }

    private static String read() throws IOException {
        return new Console().console().readLine();
    }
}
