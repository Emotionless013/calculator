package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParameterizedTest {

    CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> ParamsForTest() {
        return Stream.of(
                Arguments.of(5, 10),
                Arguments.of(15, 20)
        );
    }

    @ParameterizedTest
    @MethodSource("ParamsForTest")
    public void plusParamTest(int param1, int param2) {
        String result1 = out.plus(param1, param2);
        String testResult1 = param1 + " + " + param2 + " = " + (param1 + param2);
        assertEquals(result1, testResult1);
    }

    @ParameterizedTest
    @MethodSource("ParamsForTest")
    public void minusParamTest(int param1, int param2) {
        String result1 = out.minus(param1, param2);
        String testResult1 = param1 + " - " + param2 + " = " + (param1 - param2);
        assertEquals(result1, testResult1);
    }

    @ParameterizedTest
    @MethodSource("ParamsForTest")
    public void multiplyParamTest(int param1, int param2) {
        String result1 = out.multiply(param1, param2);
        String testResult1 = param1 + " * " + param2 + " = " + (param1 * param2);
        assertEquals(result1, testResult1);
    }

    @ParameterizedTest
    @MethodSource("ParamsForTest")
    public void divideParamTest(double param1, double param2) {
        String result1 = out.divide(param1, param2);
        String testResult1 = param1 + " / " + param2 + " = " + (param1 / param2);
        assertEquals(result1, testResult1);
    }
}

