package Calculator;

import java.io.IOException;

public class EasyCalculator {

    public static void main(String[] args) throws IOException {
        do {
            String[] expressionArgs = Other.readOperation();
            Double result = new Operations().getResultNumber(expressionArgs);
            if (result != null) System.out.println(result);

        } while (Other.repeat());
        new Console().console().close();
    }
}
