package lab4.task2;

public final class IntegerCalculatorResult extends CalculatorResult {

    public IntegerCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Integer computeResult(){
        switch (request.operation()){
            case "+":
                return Integer.parseInt((String)request.leftOperand()) + Integer.parseInt((String)request.rightOperand());
            case "-":
                return Integer.parseInt((String)request.leftOperand()) - Integer.parseInt((String)request.rightOperand());
            case "*":
                return Integer.parseInt((String)request.leftOperand()) * Integer.parseInt((String)request.rightOperand());
            case "/":
                return Integer.parseInt((String)request.leftOperand()) / Integer.parseInt((String)request.rightOperand());
            default:
                return 0;
        }
    };
}
