package lab11.task1;

import java.util.List;

public class PrinParallelStream {

    public static void main(List<Integer> list) {
        list.parallelStream().forEach(el -> System.out.println(el + "^2="+(el*el)));
    }
}
