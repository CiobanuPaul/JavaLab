package lab4.task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        var d =  new HashMap<String, Double>();
        d.put("mate", 3.0);
        var s = new Student("Gica", d);
        Student t;
        try {
            t = (Student) s.clone();
            s.getCourseInformation().put("Romana", 10.0);
            System.out.println(t);
        }
        catch(CloneNotSupportedException e){
            System.err.println(e.getMessage());
        }

    }
}
