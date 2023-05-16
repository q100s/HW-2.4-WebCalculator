package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.exceptions.BadNumbersException;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showMainScreen() {
        return calculatorService.showMainScreen();
    }

    @GetMapping(path = "/plus")
    public String summarize(@RequestParam("num1") double a, @RequestParam("num2") double b) {
        return String.format("%s + %s = %s", a, b, calculatorService.summarize(a, b));
    }

    @GetMapping(path = "/minus")
    public String subtract(@RequestParam("num1") double a, @RequestParam("num2") double b) {
        return String.format("%s - %s = %s", a, b, calculatorService.subtract(a, b));
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") double a, @RequestParam("num2") double b) {
        return String.format("%s * %s = %s", a, b, calculatorService.multiply(a, b));
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") double a, @RequestParam("num2") double b) {
        try {
            return String.format("%s / %s = %s", a, b, calculatorService.divide(a, b));
        } catch (BadNumbersException e) {
            e.printStackTrace();
            return "Divider can't be zero!";
        }
    }
}

