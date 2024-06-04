package lab13;

import java.util.List;
import java.util.ArrayList;

public class Bilant implements Comparable<Bilant>{
    private int pozitive, negative;

    public Bilant(int pozitive, int negative){
        this.pozitive = pozitive;
        this.negative = negative;
    }

    public Bilant(){
        this(0,0);
    }

    public int compareTo(Bilant b){
        return (b.pozitive - b.negative) - (this.pozitive - this.negative);
    }

    public String toString(){
        return "Bilant{pozitive: " + this.pozitive + ", negative: " + this.negative + "}";
    }

    public static void main(String[] args){
        List<Bilant> list = new ArrayList<>();
        list.add(new Bilant());
        list.add(new Bilant(1, 2));
        list.add(new Bilant(5, 4));
        list.stream().sorted().forEach(System.out::println);
    }
}
