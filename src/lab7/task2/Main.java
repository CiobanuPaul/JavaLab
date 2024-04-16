package lab7.task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int toPrint;
        try (FileReader fr = new FileReader("lab7task1.txt")) {
            while((char)fr.read()!='\n'){}
            while(true){
                toPrint = fr.read();
                if(toPrint == -1)
                    break;
                System.out.print((char)toPrint);
            }
        }
        catch (Exception e){
            throw new RuntimeException("File not found!");
        }
    }
}
