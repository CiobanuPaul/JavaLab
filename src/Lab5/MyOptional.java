package Lab5;

import java.util.Optional;

public class MyOptional<T> {
    Optional<T> opt;
    MyOptional(Optional<T> opt){
        this.opt = opt;
    }
    static <T> MyOptional of(T value){
        return new MyOptional(Optional.of(value));
    }

    boolean isPresent(){
        return opt.isPresent();
    }

    T get(){
        return opt.get();
    }
}
