package test;

import calculator.operations.Multiplication;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TestMultiplication {

    @Test
    public void getCalculationResultPositive1() throws RuntimeException {
        double a = 5;
        double b = 5;
        double endNumber = 25;
        double result = Multiplication.getCalculationResult(a, b);
        assertThat(String.format("Ответ должен быть [%s]", endNumber), result, equalTo(endNumber));
    }

    @Test
    public void getCalculationResultPositive2() throws RuntimeException {
        double a = 5;
        double b = 0;
        double endNumber = 0;
        double result = Multiplication.getCalculationResult(a, b);
        assertThat(String.format("Ответ должен быть [%s]", endNumber), result, equalTo(endNumber));
    }

    @Test
    public void getCalculationResultNegative() throws RuntimeException {
        double a = -5;
        double b = 2;
        double endNumber = -10;
        double result = Multiplication.getCalculationResult(a, b);
        assertThat(String.format("Ответ должен быть [%s]", endNumber), result, equalTo(endNumber));
    }
}
