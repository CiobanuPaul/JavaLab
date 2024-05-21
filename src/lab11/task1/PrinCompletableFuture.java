package lab11.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class PrinCompletableFuture {
    public static void main(List<Integer> list) {
        List<CompletableFuture<Void>> futures = new ArrayList<>();

        for(var el: list){
            CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> el + "^2=" + (el*el))
                    .thenAccept(System.out::println);
            futures.add(future);
        }

        // Wait for all futures to complete
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
        try {
            allFutures.get(); // This will block until all futures are complete
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
