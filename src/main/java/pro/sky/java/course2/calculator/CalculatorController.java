package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showMainScreen() {
        return calculatorService.showMainScreen();
    }
    @GetMapping(path = "/calculator/plus")
    public String summarize (@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return calculatorService.summarize(number1, number2);
    }
    @GetMapping(path = "/calculator/minus")
    public String subtract (@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return calculatorService.subtract(number1, number2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply (@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return calculatorService.multiply(number1, number2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide (@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return calculatorService.divide(number1, number2);
    }
}
