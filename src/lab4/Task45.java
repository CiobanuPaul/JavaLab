package lab4;

public class Task45 {
    public static void main(String args[]) {
        foo();
        bar();
    }

    public static void foo() {
        try {
            System.out.println("1");
            throw new RuntimeException("hello");
        } catch (RuntimeException e) {
            System.out.println("2");
        }

        System.out.println("3");
    }


    public static void bar() {
        try {
            throw new ClassCastException();
        }catch (ClassCastException e){
            System.out.println(e.getMessage());
        }catch (RuntimeException e) {
            System.out.println("fail");
        }
    }
}




