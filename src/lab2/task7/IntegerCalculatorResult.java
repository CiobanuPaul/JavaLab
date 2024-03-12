package lab2.task7;

public class IntegerCalculatorResult extends CalculatorResult{

    public IntegerCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Integer computeResult(){
        switch (request.getOperation()){
            case "+":
                return Integer.parseInt((String)request.getLeftOperand()) + Integer.parseInt((String)request.getRightOperand());
            case "-":
                return Integer.parseInt((String)request.getLeftOperand()) - Integer.parseInt((String)request.getRightOperand());
            case "*":
                return Integer.parseInt((String)request.getLeftOperand()) * Integer.parseInt((String)request.getRightOperand());
            case "/":
                return Integer.parseInt((String)request.getLeftOperand()) / Integer.parseInt((String)request.getRightOperand());
            default:
                return 0;
        }
    };
}
