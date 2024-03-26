package lab4.task2;

public final class DoubleCalculatorResult extends CalculatorResult {
    public DoubleCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Double computeResult(){
        switch (request.operation()){
            case "+":
                return Double.parseDouble((String)request.leftOperand()) + Double.parseDouble((String)request.rightOperand());
            case "-":
                return Double.parseDouble((String)request.leftOperand()) - Double.parseDouble((String)request.rightOperand());
            case "*":
                return Double.parseDouble((String)request.leftOperand()) * Double.parseDouble((String)request.rightOperand());
            case "/":
                return Double.parseDouble((String)request.leftOperand()) / Double.parseDouble((String)request.rightOperand());
            default:
                return 0.0;
        }
    };
}
