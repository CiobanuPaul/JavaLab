package lab13;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CustomThread extends Thread{
    private String line;
    private String chr;
    private int nr=0;
    public CustomThread(String line, String chr){
        this.line = line;
        this.chr = chr;
    }

    @Override
    public void run(){
        nr = 0;
        char cc = chr.toCharArray()[0];
        for(var c:line.toCharArray()) {
            if (c == cc)
                nr++;
        }
    }

    public int getNr(){
        return nr;
    }

}


public class MyFileReader {

    public static void main(String[] args) {
        String chr = args[0];
        String path = args[1];
        try (FileReader fileReader = new FileReader(path)) {
            StringBuilder s = new StringBuilder();
            while (fileReader.ready()) {
                s.append(Character.toString(fileReader.read()));
            }
            List<String> lines = List.of(s.toString().split("\n"));
            List<Thread> threads = new ArrayList<>();
            for (var line : lines) {
                Thread t = new CustomThread(line, chr);
                threads.add(t);
                t.start();
            }

            int nr_total = 0;
            for (var t : threads) {
                t.join();
                nr_total += ((CustomThread) t).getNr();
            }
            System.out.println(nr_total);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}


