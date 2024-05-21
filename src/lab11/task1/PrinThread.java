package lab11.task1;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

class CustomThread extends Thread {
    private List<Integer> list;

    CustomThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for(var el: list){
            System.out.println(el+"^2="+el*el);
        }
    }
}


public class PrinThread {
    public static void main(List<Integer> list) {
        int numOfThreadsAvailable = Runtime.getRuntime().availableProcessors();

        List<List<Integer>> sublists = new ArrayList<>(numOfThreadsAvailable);
        int n = list.size();
        for (int i = 0; i < numOfThreadsAvailable; i++) {
            sublists.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int index = i%numOfThreadsAvailable;
            sublists.get(index).add(list.get(i));
        }

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < numOfThreadsAvailable; i++) {
            if(!sublists.get(i).isEmpty()) {
                Thread t = new CustomThread(sublists.get(i));
                threads.add(t);
                t.start();
            }

        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
