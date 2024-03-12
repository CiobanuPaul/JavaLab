package lab2.task7;

public class DoubleCalculatorResult extends CalculatorResult{
    public DoubleCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Double computeResult(){
        switch (request.getOperation()){
            case "+":
                return Double.parseDouble((String)request.getLeftOperand()) + Double.parseDouble((String)request.getRightOperand());
            case "-":
                return Double.parseDouble((String)request.getLeftOperand()) - Double.parseDouble((String)request.getRightOperand());
            case "*":
                return Double.parseDouble((String)request.getLeftOperand()) * Double.parseDouble((String)request.getRightOperand());
            case "/":
                return Double.parseDouble((String)request.getLeftOperand()) / Double.parseDouble((String)request.getRightOperand());
            default:
                return 0.0;
        }
    };
}
