package lab3.task7;

import java.util.*;

public class UniqueList<T> implements List<T> {
    private final List<T> storage;

    public UniqueList() {
        this.storage = new ArrayList();
    }

    @Override
    public String toString() {
        return storage.toString();
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return storage.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }

    @Override
    public Object[] toArray() {
        return storage.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return storage.toArray(a);
    }

    @Override
    public boolean add(T t) {
        if(storage.contains(t))
//            throw new IllegalArgumentException("The list already contains the element!");
            return false;
        return storage.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return storage.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return new HashSet<>(storage).containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        var ok=false;
        for(var el:c)
            if(!storage.contains(el)) {
                storage.add(el);
                ok = true;
            }
        return ok;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        var ok=false;
        for(var el:c)
            if(!storage.contains(el)) {
                storage.add(index++, el);
                ok = true;
            }
        return ok;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return storage.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return storage.retainAll(c);
    }

    @Override
    public void clear() {
        storage.clear();
    }

    @Override
    public T get(int index) {
        return storage.get(index);
    }

    @Override
    public T set(int index, T element) {
        if(index < 0)
            throw new IndexOutOfBoundsException("The index is out of bounds!");
        if(storage.contains(element))
            throw new IllegalArgumentException("The list already contains the element!");
        return storage.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        if(storage.contains(element))
            throw new IllegalArgumentException("The list already contains the element!");
        storage.add(index, element);
    }

    @Override
    public T remove(int index) {
        return storage.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return storage.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return storage.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return storage.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return storage.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return storage.subList(fromIndex, toIndex);
    }
}