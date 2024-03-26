package lab4.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Main {
    public static void foo(String[] args){
        List<CalculatorResult> calculationResults = SmarterCalculator.calculate(args);

        for (CalculatorResult result : calculationResults) {
            CalculatorRequest request = result.getRequest();
            try {
                System.out.println("Operation " + request + " has result " + result.computeResult());
            }
            catch(InvalidOperationException e){
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args){
        List<String> datas = new ArrayList<String>();
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                var tokens = data.split(" ");
                if(tokens.length != 3)
                    throw new InvalidArgumentsLengthException("Too many arguments in operation!");
                for(var token:tokens)
                    datas.add(token);
//                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        catch (InvalidArgumentsLengthException e){
            System.err.println(e.getMessage());
        }

        String[] args2 = new String[datas.size()];
        for(int i=0; i<datas.size(); i++)
            args2[i] = datas.get(i);

        foo(args2);
    }
}
