package lab9.task1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.SortedSet;

public class SortedListSet<T extends Comparable<T>> extends LinkedList<T> implements SortedSet<T> {

    Comparator<? super T> comparator;

    public SortedListSet(){
        super();
        comparator = Comparator.naturalOrder();
    }

    public SortedListSet(Comparator<? super T> comparator){
        super();
        this.comparator = comparator;
    }

    @Override
    public Comparator<? super T> comparator() {
        return comparator;
    }

    @Override
    public SortedSet<T> subSet(T fromElement, T toElement) {
        return (SortedListSet<T>) super.subList(super.indexOf(fromElement), super.indexOf(toElement));
    }

    @Override
    public SortedSet<T> headSet(T toElement) {
        return (SortedListSet<T>) super.subList(0, super.indexOf(toElement));
    }

    @Override
    public SortedSet<T> tailSet(T fromElement) {
        return (SortedListSet<T>) super.subList(super.indexOf(fromElement), super.size()-1);
    }

    @Override
    public T first() {
        return super.get(0);
    }

    @Override
    public T last() {
        return super.get(super.size()-1);
    }

    public boolean add(T o){
        boolean ok = super.add(o);
        super.sort(comparator);
        return ok;
    }

}
