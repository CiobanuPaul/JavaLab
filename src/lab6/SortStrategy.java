package lab6;

import java.util.List;

public abstract class SortStrategy {
    protected SortStrategy(){}
    static SortStrategy instance = null;
    public abstract void sort(List<Student> studenti);

    public abstract String getStrategyName();

}
