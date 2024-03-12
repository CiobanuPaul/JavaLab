package lab2.task1;

import lab2.task7.CalculatorRequest;
import lab2.task7.CalculatorResult;
import lab2.task7.SmarterCalculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void foo(String[] args){
        List<CalculatorResult> calculationResults =  SmarterCalculator.calculate(args);

        for (CalculatorResult result : calculationResults) {
            CalculatorRequest request = result.getRequest();
            System.out.println("Operation " + request + " has result " + result.computeResult());
        }
    }

    public static void main(String[] args){
        List<String> datas = new ArrayList<String>();
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for(var token:data.split(" "))
                    datas.add(token);
//                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String[] args2 = new String[datas.size()];
        for(int i=0; i<datas.size(); i++)
            args2[i] = datas.get(i);

        foo(args2);
    }
}
