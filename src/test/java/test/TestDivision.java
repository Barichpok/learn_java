package test;

import calculator.operations.Division;
import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TestDivision {

    @Test
    public void getCalculationResultPositive1() throws RuntimeException {
        double a = 5;
        double b = 5;
        double endNumber = 1;
        double result = Division.getCalculationResult(a, b);
        assertThat(String.format("Ответ должен быть [%s]", endNumber), result, equalTo(endNumber));
    }

    @Test
    public void getCalculationResultPositive2() throws RuntimeException {
        double a = -12;
        double b = -6;
        double endNumber = 2;
        double result = Division.getCalculationResult(a, b);
        assertThat(String.format("Ответ должен быть [%s]", endNumber), result, equalTo(endNumber));
    }

    @Test
    public void getCalculationResultNegative1() throws RuntimeException {
        double a = 0;
        double b = 5;
        double endNumber = 0;
        double result = Division.getCalculationResult(a, b);
        assertThat(String.format("Ответ должен быть [%s]", endNumber), result, equalTo(endNumber));
    }

    @Test
    public void getCalculationResultNegative2() throws RuntimeException {
        double a = 5;
        double b = 0;
        double endNumber = Infinity;
        double result = Division.getCalculationResult(a, b);
        assertThat(String.format("Ответ должен быть [%s]", endNumber), result, equalTo(endNumber));
    }
}
