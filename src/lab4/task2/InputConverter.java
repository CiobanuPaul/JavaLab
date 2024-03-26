package lab4.task2;

import java.util.ArrayList;
import java.util.List;

public record InputConverter() {
    public static List<CalculatorRequest> mapRequests(String[] args){
        List<CalculatorRequest> requests = new ArrayList<CalculatorRequest>();
        int k= 2;
        while (k < args.length){
            requests.add(new CalculatorRequest(args[k-2], args[k], args[k-1]));
            k += 3;
        }
        return requests;
    }
}
