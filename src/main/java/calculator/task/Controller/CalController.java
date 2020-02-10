package calculator.task.Controller;

import calculator.task.modals.cal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalController
{
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("operator", "+");
        model.addAttribute("view", "views/calculatorForm");
        return "base-layout";
    }

    @PostMapping("/")
    public String index(
            @RequestParam String leftOp,
            @RequestParam String operator,
            @RequestParam String rightOp,
            Model model
    ) {
        double leftNumber;
        double rightNumber;

        try {
            leftNumber = Double.parseDouble(leftOp);
        }
        catch (NumberFormatException ex) {
            leftNumber = 0;
        }

        try {
            rightNumber = Double.parseDouble(rightOp);
        }
        catch (NumberFormatException ex) {
            rightNumber = 0;
        }

        cal cal = new cal(
                leftNumber,
                rightNumber,
                operator
        );

        double result = cal.calculResult();
        model.addAttribute("leftOperand", leftNumber);
        model.addAttribute("operator", operator);
        model.addAttribute("rightOperand", rightNumber);
        model.addAttribute("result", result);

        model.addAttribute("view", "views/calculatorForm");
        return "base-layout";
    }
}
