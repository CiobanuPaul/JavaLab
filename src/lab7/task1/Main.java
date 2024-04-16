package lab7.task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("lab7task1.txt");
            while(fis.available() > 0 && (char)fis.read()!='\n'){}
            while(fis.available() > 0){
                char toPrint = (char) fis.read();
                System.out.print(toPrint);
            }
        }
        catch (Exception e){
            throw new RuntimeException("File not found!");
        }

    }
}
