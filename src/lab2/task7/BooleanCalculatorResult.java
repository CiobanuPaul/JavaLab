package lab2.task7;

public class BooleanCalculatorResult extends CalculatorResult{
    public BooleanCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Boolean computeResult(){
        switch (request.getOperation()){
            case "&&":
                return Boolean.parseBoolean((String)request.getLeftOperand()) && Boolean.parseBoolean((String)request.getRightOperand());
            case "||":
                return Boolean.parseBoolean((String)request.getLeftOperand()) || Boolean.parseBoolean((String)request.getRightOperand());
            default:
                return false;
        }
    };
}
