package lab3.task6;

public abstract class CalculatorResult {
    protected final CalculatorRequest request;
    public CalculatorRequest getRequest(){
        return request;
    };

    public abstract Object computeResult();

    protected CalculatorResult(CalculatorRequest calculatorRequest){
        request = calculatorRequest;
    }
}
