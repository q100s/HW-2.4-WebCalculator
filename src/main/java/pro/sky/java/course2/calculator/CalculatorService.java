package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

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
        double number3;
        if (number2 == 0) {
            throw new Error("Divider can't be zero!"); //не знаю как выкинуть ошибку на страницу браузера :D
        } else {
            number3 = number1 / number2;
        }
        return number3;
    }
}
