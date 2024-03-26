package lab4.task2;

import java.util.ArrayList;
import java.util.List;

public record SmarterCalculator() {
    public static List<CalculatorResult> calculate(String[] args){
        var requests = InputConverter.mapRequests(args);
        List<CalculatorResult> results = new ArrayList<CalculatorResult>();
        for (var req:requests){
            try {
                switch (req.getRequestType()) {
                    case "int":
                        results.add(new IntegerCalculatorResult(req));
                        break;
                    case "double":
                        results.add(new DoubleCalculatorResult(req));
                        break;
                    case "boolean":
                        results.add(new BooleanCalculatorResult(req));
                        break;
                    default:
                        results.add(null);
                        break;
                }
            }
            catch(UnknownOperandTypeException e){
                System.err.println(e.getMessage());
            }
        }
        return results;
    }
}
