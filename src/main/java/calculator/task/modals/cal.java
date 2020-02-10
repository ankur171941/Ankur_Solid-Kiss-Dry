package calculator.task.modals;

public class cal
{
    private double leftOperand;
    private double rightOperand;
    private String operator;

    public cal(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public double calculResult() {
        double r = 0;
        switch(this.operator) {
            case "+":
                r = this.leftOperand + this.rightOperand;
                break;
            case "-":
                r = this.leftOperand - this.rightOperand;
                break;
            case "*":
                r= this.leftOperand * this.rightOperand;
                break;
            case "/":
                r = this.leftOperand / this.rightOperand;
                break;
            case "^":
                r = Math.pow(this.leftOperand,this.rightOperand);
                break;
            default:
                r = 0;
        }

        return r;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


}
