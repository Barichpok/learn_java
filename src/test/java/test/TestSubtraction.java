package test;

import calculator.operations.Subtraction;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TestSubtraction {

    @Test
    public void getCalculationResultPositive() throws RuntimeException {
        double a = 6;
        double b = 3;
        double endNumber = 3;
        double result = Subtraction.getCalculationResult(a, b);
        assertThat(String.format("Ответ должен быть [%s]", endNumber), result, equalTo(endNumber));
    }

    @Test
    public void getCalculationResultNegative() throws RuntimeException {
        double a = 0;
        double b = 5;
        double endNumber = -5;
        double result = Subtraction.getCalculationResult(a, b);
        assertThat(String.format("Ответ должен быть [%s]", endNumber), result, equalTo(endNumber));
    }
}
