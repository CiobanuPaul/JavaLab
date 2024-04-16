package lab7.task3;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        String str = "fisier_";
        for(int i=0; i<10; i++){
            try {
                File myfile = new File(str+(i+1));
                myfile.delete();
                myfile.createNewFile();
                FileWriter fileWriter = new FileWriter(myfile);
                Date date = new Date();
                String toBeWritten = (i + 1) + "\n" + date.toString();
                for (int j = 0; j < toBeWritten.length(); j++) {
                    fileWriter.append(toBeWritten.charAt(j));
                }
                fileWriter.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
