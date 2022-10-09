package pro.sky.calculator;

import org.springframework.stereotype.Service;
import pro.sky.calculator.Exeptions.DevideZeroExeption;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(double num1, double num2) {
        if (num2 == 0) {
            throw new DevideZeroExeption();
        } else {
            double result = num1 / num2;
            return num1 + " / " + num2 + " = " + result;
        }
    }
}
