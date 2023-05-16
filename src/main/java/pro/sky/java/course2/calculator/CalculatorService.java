package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.exceptions.BadNumbersException;

@Service
public class CalculatorService {
    public String showMainScreen() {
        return "Enter request, please";
    }
    public double summarize (double number1,double number2) {
        return number1 + number2;
    }
    public double subtract (double number1,double number2) {
        return number1 - number2;
    }
    public double multiply (double number1,double number2) {
        return number1 * number2;
    }
    public double divide (double number1,double number2) {
        if (number2 == 0) {
            throw new BadNumbersException("Divider can't be zero!");
        }
        return number1 / number2;
    }
}
