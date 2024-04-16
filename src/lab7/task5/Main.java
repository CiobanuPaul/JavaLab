package lab7.task5;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args){
        List<Function<Integer, Double>> operatii = new ArrayList<>();
        operatii.add(x-> (double) (x*34));
        operatii.add(x-> (double) (x+5));
        operatii.add(x ->  (double)1/x);
        operatii.add(x -> (double) (x*x));
        operatii.add(x -> Math.sin((double)x%180 / 180));
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        List<Integer> numere = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numere.add(keyboard.nextInt());
        }
        Random randOp = new Random();
        int max = operatii.size();
        numere.stream()
                .map(x -> operatii.get(randOp.nextInt(max)).apply(x))
                .forEach(System.out::println);
    }
}
