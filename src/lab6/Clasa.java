package lab6;

import java.util.ArrayList;
import java.util.List;

public class Clasa {
    List<Student> studenti = new ArrayList<>();
    SortStrategy sortStrategy = null;
    
    public void setSortStrategy(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }
    public void sort(){
        sortStrategy.sort(studenti);
    }
    
    public void sortAndPrintStudenti(){
        if(sortStrategy == null)
            throw new RuntimeException("Nu ai setat strategia de sortare.");
        sort();
        System.out.println(sortStrategy.getStrategyName());
        for (int i = 0; i < 5; i++) {
            
        }
    }
}
