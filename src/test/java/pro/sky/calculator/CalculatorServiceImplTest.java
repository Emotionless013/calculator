package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import pro.sky.calculator.Exeptions.DevideZeroExeption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {

    int param1 = 5;
    int param2 = 10;
    int param3 = 15;
    int param4 = 20;
    double param5 = 5;
    double param6 = 10;
    double param7 = 15;
    double param8 = 20;
    double param9 = 0;
    CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void plusTest() {
        String result1 = out.plus(param1, param2);
        String result2 = out.plus(param3, param4);
        String testResult1 = param1 + " + " + param2 + " = " + (param1 + param2);
        String testResult2 = param3 + " + " + param4 + " = " + (param3 + param4);
        assertEquals(result1, testResult1);
        assertEquals(result2, testResult2);
    }

    @Test
    public void minusTest() {
        String result1 = out.minus(param1, param2);
        String result2 = out.minus(param3, param4);
        String testResult1 = param1 + " - " + param2 + " = " + (param1 - param2);
        String testResult2 = param3 + " - " + param4 + " = " + (param3 - param4);
        assertEquals(result1, testResult1);
        assertEquals(result2, testResult2);
    }

    @Test
    public void multiplyTest() {
        String result1 = out.multiply(param1, param2);
        String result2 = out.multiply(param3, param4);
        String testResult1 = param1 + " * " + param2 + " = " + (param1 * param2);
        String testResult2 = param3 + " * " + param4 + " = " + (param3 * param4);
        assertEquals(result1, testResult1);
        assertEquals(result2, testResult2);
    }

    @Test
    public void divideTest() {
        String result1 = out.divide(param5, param6);
        String result2 = out.divide(param7, param8);
        String testResult1 = param5 + " / " + param6 + " = " + (param5 / param6);
        String testResult2 = param7 + " / " + param8 + " = " + (param7 / param8);
        assertEquals(result1, testResult1);
        assertEquals(result2, testResult2);
    }

    @Test
    public void divideZeroTest() {
        assertThrows(DevideZeroExeption.class, () -> out.divide(param7, param9));
    }
}
