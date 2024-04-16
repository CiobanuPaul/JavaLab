package lab7.task4;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.String.format;

class Obiect{
    public int nr, patrat;

    public Obiect(int nr, int patrat) {
        this.nr = nr;
        this.patrat = patrat;
    }

    public int getNr() {
        return nr;
    }

    public int getPatrat() {
        return patrat;
    }

    @Override
    public String toString() {
        return format("nr = %d, patrat = %d", nr, patrat);
    }
}


public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int n = keyboard.nextInt();
        IntStream.range(0,n+1)
                .filter(x -> x%2==0)
                .mapToObj(x-> new Obiect(x ,x*x))
                .forEach(System.out::println);
    }
}
