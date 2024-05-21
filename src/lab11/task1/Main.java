package lab11.task1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> numere = new ArrayList<>();
        Random random = new Random();
        try (FileOutputStream fileOutputStream = new FileOutputStream("timpi.txt")){

            Integer[] cate= {10, 1000, 10000, 10000000};
            for(var nr:cate){
                for (int i = 0; i < nr; i++) {
                    numere.add(random.nextInt(50));
                }
                var t1 = System.currentTimeMillis();
                PrinThread.main(numere);
                var t2 = System.currentTimeMillis();
                PrinParallelStream.main(numere);
                var t3 = System.currentTimeMillis();
                PrinCompletableFuture.main(numere);
                var t4 = System.currentTimeMillis();
                Neparalel.main(numere);
                var t5 = System.currentTimeMillis();
                String s = "Pentru "+ nr +"numere \nPrinThread: "+(t2-t1)+"ms \nPrinParallelStream: "+(t3-t2)+"ms \nPrinCompletableFuture: "+(t4-t3)+"ms \nNeparalel: "+(t5-t4)+"ms \n\n";
                fileOutputStream.write(s.getBytes());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
