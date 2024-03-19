package lab3.task6;

public final class BooleanCalculatorResult extends CalculatorResult {
    public BooleanCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Boolean computeResult(){
        switch (request.operation()){
            case "&&":
                return Boolean.parseBoolean((String)request.leftOperand()) && Boolean.parseBoolean((String)request.rightOperand());
            case "||":
                return Boolean.parseBoolean((String)request.leftOperand()) || Boolean.parseBoolean((String)request.rightOperand());
            default:
                return false;
        }
    };
}
