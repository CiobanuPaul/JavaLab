package lab12.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MyUtilityClass {
    public static <T> void printCollection(Collection<T> collection) {
        if(collection == null) {
            throw new NullPointerException("Collection is null");
        }
        System.out.print("[");
        StringBuilder stringBuilder = new StringBuilder();
        for(T o : collection) {
            stringBuilder.append(o).append(", ");
        }
        System.out.print(stringBuilder.substring(0, stringBuilder.length() - 2));
        System.out.print("]\n");
    }

    public static <T, Q> Q aggregate(Collection<T> collection, Q val, BiFunction<Q, T, Q> aggregator) {
        if(collection == null) {
            throw new NullPointerException("Collection is null");
        }
        if(val == null) {
            throw new NullPointerException("Value is null");
        }
        if(aggregator == null) {
            throw new NullPointerException("Aggregator is null");
        }

        for(T o : collection) {
            val = aggregator.apply(val, o);
        }
        return val;
    }

    public static <T> void duplicate(Collection<T> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection is null");
        }
        List<T> list = new ArrayList<>(collection);
        collection.clear();
        for (T o : list) {
            collection.add(o);
            collection.add(o);
        }
    }
}
