package lab4.task2;

public abstract class CalculatorResult {
    protected final CalculatorRequest request;
    public CalculatorRequest getRequest(){
        return request;
    };

    public abstract Object computeResult() throws InvalidOperationException;

    protected CalculatorResult(CalculatorRequest calculatorRequest){
        request = calculatorRequest;
    }
}
