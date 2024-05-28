package lab12.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    record Person(String name, int age) {}
    public static void main(String[] args) {
        HTTPCLient client = new HTTPCLient();
        client.get();
        client.get();
        client.post(new Person("Bob", 18));
    }
}
