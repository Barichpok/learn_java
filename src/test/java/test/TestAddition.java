package test;

import calculator.operations.Addition;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TestAddition {

    @Test
    public void getCalculationResultPositive() throws RuntimeException {
        double a = 5;
        double b = 5;
        double endNumber = 10;
        double result = Addition.getCalculationResult(a, b);
        assertThat(String.format("Ответ должен быть [%s]", endNumber), result, equalTo(endNumber));
    }

    @Test
    public void getCalculationResultNegative() throws RuntimeException {
        double a = -5;
        double b = 0;
        double endNumber = -5;
        double result = Addition.getCalculationResult(a, b);
        assertThat(String.format("Ответ должен быть [%s]", endNumber), result, equalTo(endNumber));
    }
}
